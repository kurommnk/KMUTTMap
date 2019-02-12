package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Restroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("        <script src=\"CSS/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/deco.css\">\n");
      out.write("        <style>\n");
      out.write("            #eiei{\n");
      out.write("                border: 5px solid #ff6600 ;\n");
      out.write("                width: 80% ;\n");
      out.write("                padding-top: 5%;\n");
      out.write("                padding-bottom: 5%;\n");
      out.write("                margin : auto ;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/head/Header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("            <br><br><br>\n");
      out.write("            <p style=\"font-size: 30px; font-weight: bold; padding-left: 10%\">RESTROOM ::</p> \n");
      out.write("            <br>\n");
      out.write("        <div id=\"eiei\">   \n");
      out.write("            <div style=\"padding-left:283.5px; display:block;position:relative;\">\n");
      out.write("                <img id=\"img1\" src=\"wapimg/1.png\" style=\"width: 50%; height: 50%\" onclick=\"window.location.href = 'Target?zone=1'\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"img-group\" style=\"padding-left: 159px\">\n");
      out.write("                <img id=\"img2\" src=\"wapimg/2.jpg\" style=\"width: 38.5%; height: 38.5%\" onclick=\"window.location.href = 'Target?zone=2'\" />\n");
      out.write("                <img id=\"img3\"src=\"wapimg/3.png\"  style=\"width: 17.1%; height: 17.1%; z-index: 2;position: relative; left:-5px\" onclick=\"window.location.href = 'Target?zone=3'\" />\n");
      out.write("                <img id=\"img4\" src=\"wapimg/4.jpg\"   style=\"width: 31.4%; height: 31.4% ; z-index: 2;position: relative; left:-9px\" onclick=\"window.location.href = 'Target?zone=4'; \"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br>\n");
      out.write("        <script type=\"text/javascript\" src=\"CSS/dec.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
