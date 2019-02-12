<%-- 
    Document   : TargetDetail
    Created on : Nov 20, 2016, 4:23:24 AM
    Author     : Bamnich
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <style>
            .detail{
                padding-top: 5%;
                padding-left: 5%;
                padding-right: 5%;
            }


        </style>


    </head>
    <body>
        <jsp:include page="/WEB-INF/head/Header.jsp"/>

        <br><br>
        <div class="detail">

            <form action="ChooseTarget" method="post">
                <img name="imgTarget" id="img${zone}" src="wapimg/${zone}.jpg" style="width: 30%; height: 30%; border: 5px solid black" onclick="window.location.href = 'Target?zone=${zone}'" />
                <span style="margin-left: 5%; font-weight: bold">Choose : </span> 

                <select name="list" >
                    <c:forEach items="${listZone}" var="listValue">
                        <option value="${listValue.buildId}" size=100">
                            ${listValue.buildName}
                        </option>
                    </c:forEach>
                </select>
                <input type="submit" value="Choose"/>
            </form>
        <br><br><br>
        <c:if test="${place !=null}">
            <div>                    
                <p>ID: ${place.buildId}</p>
                <p>NAME: ${place.buildName}</p>
                <p>Floor: ${place.floor}</p>
                <p>Describe: ${place.describe}</p>


            </div>
        </c:if>                
        </div>

    </body>
</html>
