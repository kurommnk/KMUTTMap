<%-- 
    Document   : restroom
    Created on : Nov 19, 2016, 4:40:23 PM
    Author     : Meow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <script src="CSS/jquery-3.1.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/deco.css">
        <style>
            #eiei{
                border: 5px solid #ff6600 ;
                width: 80% ;
                padding-top: 5%;
                padding-bottom: 5%;
                margin : auto ;
            }
        </style>
    </head>
    <body>
        <jsp:include page="/WEB-INF/head/Header.jsp"/>
        
            <br><br><br>
            <p style="font-size: 30px; font-weight: bold; padding-left: 10%">RESTROOM ::</p> 
            <br>
        <div id="eiei">   
            <div style="padding-left:283.5px; display:block;position:relative;">
                <img id="img1" src="wapimg/1.jpg" style="width: 50%; height: 50%" onclick="window.location.href = 'Target?zone=1'" />
            </div>
            <div id="img-group" style="padding-left: 159px">
                <img id="img2" src="wapimg/2.jpg" style="width: 38.5%; height: 38.5%" onclick="window.location.href = 'Target?zone=2'" />
                <img id="img3"src="wapimg/3.jpg"  style="width: 17.1%; height: 17.1%; z-index: 2;position: relative; left:-5px" onclick="window.location.href = 'Target?zone=3'" />
                <img id="img4" src="wapimg/4.jpg"   style="width: 31.4%; height: 31.4% ; z-index: 2;position: relative; left:-9px" onclick="window.location.href = 'Target?zone=4'; "/>
            </div>
        </div>
        <br><br><br>
        <script type="text/javascript" src="CSS/dec.js"></script>
    </body>
</html>