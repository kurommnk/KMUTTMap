<%-- 
    Document   : login
    Created on : Nov 19, 2016, 3:56:41 PM
    Author     : Meow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .detail{
                margin: auto;
                margin-top: 10%;
                padding-top: 5%; 
                padding-left: 5% ; 
                border: 2px solid black ; 
                width: 40%
            }
            /*            table, td {
                            border: 1px solid black;
                        }*/

        </style>
    </head>
    <body>
        <jsp:include page="/WEB-INF/head/Header.jsp"/>


        <div class="detail">
            <h5>Administrator Login:</h5> 
            <br>
            <form action="Login" method="POST">
                Username : &nbsp;<input type="text" name="username" style="height: 25px"/><br>
                Password : &nbsp;&nbsp;<input type="password" name="password" style="height: 25px"/>&nbsp;&nbsp;
                <input type="submit" style="height: 30px; width: 70px" value="OK" name="Login" />

            </form><br>
            <p style="color: red">${message}</p>
        </div>

    </body>
</html>
