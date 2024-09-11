package com.servlet;

import com.dao.AppointmentDao;
import com.db.dbconnect;
import com.entity.Appointment;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet("/CreateAppointmentServlet")
public class CreateAppointmentServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(CreateAppointmentServlet.class.getName());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int consultant_id = Integer.parseInt(request.getParameter("consultant_id"));
            int jobseeker_id = Integer.parseInt(request.getParameter("jobseeker_id"));
            String appointmentDate = request.getParameter("appointment_date");
            String appointmentTime = request.getParameter("appointment_time");
            String appointmentDatetime = appointmentDate + " " + appointmentTime + ":00"; // Format as "yyyy-MM-dd HH:mm:ss"

            HttpSession session = request.getSession();
            Appointment c = new Appointment(consultant_id, jobseeker_id, appointmentDatetime);
            AppointmentDao dao = new AppointmentDao(dbconnect.getConn());
            boolean f = dao.registerAppointment(c);
            
            if (f) {
                session.setAttribute("sucMsg", "Appointment Registered Successfully");
                response.sendRedirect("admindashboard.jsp");
            } else {
                session.setAttribute("errorMsg", "Failed to create appointment");
                response.sendRedirect("createAppointment.jsp");
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while creating the appointment", e);
            e.printStackTrace();
        }
    }
}