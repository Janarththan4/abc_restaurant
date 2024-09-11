<%-- 
    Document   : home.jsp
    Created on : 22-Aug-2023, 00:28:27
    Author     : Joy Chuzana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@ include file="header.jsp"%>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
        }

        .container {
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 10vh;
            flex-direction: column;
        }

        .box {
            background-color: whitesmoke;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 80%;
            max-width: 800px;
            margin-top: 20px;
        }

        h2 {
            color: #333;
            font-size: 24px;
        }

        p {
            font-size: 16px;
            line-height: 1.6;
            color: #555;
        }

        ul {
            list-style: disc;
            margin-left: 20px;
        }

        li {
            font-size: 16px;
            line-height: 1.6;
            color: #555;
        }

        strong {
            font-weight: bold;
        }
    </style>
</head>
<body>
    <img src="https://shorturl.at/buDYu" alt="alt" height="400" width="1480">
    <div class="container">
        <h2>Welcome to ABC Restaurant</h2>
        <p>ABC Restaurant is one of the top restaurant chains in Sri Lanka, known for its diverse cuisine and excellent service. We offer a range of services to cater to all your dining needs, whether you're dining in or ordering online for delivery.</p>
    </div>

    <div class="container">
        <div class="box">
            <h2>About Us</h2>
            <p>We provide different services to enhance your dining experience:</p>
            <ul>
                <li><strong>Dine-In Reservations:</strong> Book your table in advance and enjoy a personalized dining experience with us.</li>
                <li><strong>Delivery Services:</strong> Place your order online and have your favorite meals delivered right to your doorstep.</li>
                <li><strong>Takeaway Options:</strong> Pick up your food and enjoy it on the go, perfect for those with a busy lifestyle.</li>
            </ul>
            <p>For inquiries, you can contact us using the following details:</p>
            <ul>
                <li><strong>Telephone:</strong> 0111223456</li>
                <li><strong>Email:</strong> abcrestaurant@gmail.com</li>
                <li><strong>Address:</strong> No 123, Main Road, Colombo 7, Sri Lanka</li>
            </ul>
        </div>
    </div>
</body>
</html>
