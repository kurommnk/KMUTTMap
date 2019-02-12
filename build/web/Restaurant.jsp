<%-- 
    Document   : Restaurant
    Created on : Nov 20, 2016, 2:06:33 AM
    Author     : Bamnich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/head/Header.jsp"/>
        <br><br><br>
            <p style="font-size: 30px; font-weight: bold; padding-left: 10%">RESTAURANT ::</p> 
            <br>
        <div id="eiei">   
            <div style="padding-left:283.5px; display:block;position:relative;">
                <img id="img1" src="wapimg/11.jpg" style="width: 50%; height: 50%" onclick="window.location.href = 'Target?zone=11'" />
            </div>
            <div id="img-group" style="padding-left: 159px">
                <img id="img2" src="wapimg/22.jpg" style="width: 38.5%; height: 38.5%" onclick="window.location.href = 'Target?zone=22'" />
                <img id="img3"src="wapimg/33.jpg"  style="width: 17.1%; height: 17.1%; z-index: 2;position: relative; left:-5px" onclick="window.location.href = 'Target?zone=33'" />
                <img id="img4" src="wapimg/44.jpg"   style="width: 31.4%; height: 31.4% ; z-index: 2;position: relative; left:-9px" onclick="window.location.href = 'Target?zone=44'; "/>
            </div>
        </div>
        <br><br><br>
        <script type="text/javascript" src="CSS/dec.js"></script>
    </body>
</html>
