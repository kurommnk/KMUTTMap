/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Building;
import model.Map;

/**
 *
 * @author Meow
 */
public class SearchServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String param = request.getParameter("searchparam");
        System.out.println("param"+ param);
        if (param != null && param.trim().length()!=0) {
            
            Map m = new Map();
            Building b = null;
            m.putData(1);
            System.out.println(m.putData(1) + " after if");

            if (m.check(param) == true) {
                System.out.println(param);
                String sub = param.substring(0, param.length());
                try {
                    int parseint = Integer.parseInt(sub);
                    b = new Building();
                    b = m.findById(parseint);
                    request.getSession().setAttribute("build", b);
                    System.out.println(b.getBuildName());
                } catch (Exception e) {
                    System.out.println("errorrrrrrr");
                    getServletContext().getRequestDispatcher("/Homepage.jsp").forward(request, response);
                    return;
                }
            } else {
                b = new Building();
                b = m.findByName(param);
                request.getSession().setAttribute("build", b);

            }
        } else {
            request.setAttribute("message", "Please, enter information");
        }
        getServletContext().getRequestDispatcher("/Homepage.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
