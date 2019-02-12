<%-- 
    Document   : Homepage
    Created on : 11 พ.ย. 2559, 18:39:01
    Author     : macbook
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <style>
            .detail{
                padding-top: 5%;
                padding-left: 5%;
                padding-right: 5%;
            }
            /*            table, td {
                            border: 1px solid black;
                        }*/

        </style>

    </head>
    <jsp:include page="/WEB-INF/head/Header.jsp"/>

    <body>
        <div class="detail">
            <table>

                <tr>
                    <td rowspan="2" style="text-align: center">
                        <img src="CSS/mimap.png" width="85%" style="margin-left: 5% ; margin-top:2% ;"/>
                    </td>
                    
                    <td style="height: 20%;width: 35%; margin-bottom: 10%">   
                        
                        <form action="Search" method="post">
                            <div style="text-align: right">
                                <p style="text-align: left">Search Location:</p>
                                <input type="text" name="searchparam" placeholder=" i.e. อาคารสัมมนา, 1"
                                       style="width: 87% ; height: 30px;"/>&nbsp;
                                <input type="submit" style="height: 35px " value="GO"/>
                                <!--<img src="CSS/konha.png">-->

                            </div>
                        </form>
                        <p style="color: red">${message}</p>
                    </td>
                    
                </tr>
                <tr>  
                    <td style="background-color: rgb(255, 139, 53) ;  padding-left: 5%">
                        <p style="color:rgb(255, 139, 53)">.. .</p>
                        <c:if test="${build!=null}">
                            <div>
                                <img src='image/${build.buildId}.jpg' width="50%" 
                                     style="margin-left: 10px ; margin-bottom: 10 px ; margin-top: 1%"/><br><br>
                                <p>Build ID: ${build.buildId}</p>
                                <p>Build Name: ${build.buildName}</p>
                                <p>Floor: ${build.floor}</p>
                                <p>Type: ${build.type}</p>
                                <p>Describe: ${build.describe}</p>       
                            </div>
                        </c:if>
                    </td>
                </tr>

            </table>
        </div><br><br>
    </body>
</html>
