package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ConsultantDao;
import com.db.dbconnect;
import com.entity.Consultant;
import javax.servlet.http.Cookie;

@WebServlet("/Consultantservlet")
public class Consultantservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        ConsultantDao dao = new ConsultantDao(dbconnect.getConn());
        Consultant consultant = dao.login(email, password);
        String id = Integer.toString(consultant.getId());

        if (consultant != null) {
            session.setAttribute("userObj", consultant);
            resp.addCookie(new Cookie("consultantId", id));
            resp.addCookie(new Cookie("loggedInType", "CONSULTANT"));

            resp.sendRedirect("consultantdashboard.jsp");
        } else {
            session.setAttribute("errorMsg", "invalid email & password");
            resp.sendRedirect("consultantlogin.jsp");
        }

    }

}
