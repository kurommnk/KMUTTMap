<%-- 
    Document   : Homepage
    Created on : 11 พ.ย. 2559, 18:39:01
    Author     : macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="header">
            <br>
            <img src="CSS/logoo.png">&nbsp;&nbsp;
        </div> 
        <div id="wrapper"> 
            <div class="overlay"></div> 
            <!-- Sidebar -->
            <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
                <ul class="nav sidebar-nav"> <!--ห้ามลบ-->
                    <li class="sidebar-brand">
                        <a href="#">
                              <b>MENU</b>
                        </a>
                    </li>
                    <li>
                        <a href="Homepage.jsp"><i class=""></i> หน้าหลัก</a>
                    </li>
                    <li>
                        <a href="Restaurant.jsp"><i class=""></i> ร้านอาหาร</a>
                    </li>
                    <li>
                        <a href="Restroom.jsp"><i class=""></i> ห้องน้ำ</a>
                    </li>
                    <li>
                        <a href="Routing.jsp"><i class=""></i> การเดินทาง</a>
                    </li>
                                       

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-fw fa-plus"></i> อื่นๆ <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li class="dropdown-header"> Other .. . </li>
                            <li><a href="#">Access Wi-fi</a></li>


                        </ul>
                    </li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li><a href="Login.jsp">Administrator</a></li>
                    
                </ul>
            </nav>
            <!-- /#sidebar-wrapper -->
            <!-- Page Content -->
            <div id="page-content-wrapper">
                <button type="button" class="hamburger is-closed animated fadeInLeft" data-toggle="offcanvas">
                    <span class="hamb-top"></span>
                    <span class="hamb-middle"></span>
                    <span class="hamb-bottom"></span>
                </button>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

        <!-- /#wrapper -->
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>
        <script src="CSS/index.js"></script> 


    </body>
</html>
