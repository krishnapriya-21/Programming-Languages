/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/UpdateData"})
public class UpdateData extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateData</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateData at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Input validation
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("string");
            if (name == null || name.trim().isEmpty()) {
                out.println("<h3 style='color:red;'>Invalid input. All fields are required.</h3>");
                return;
            }
            // Update query
            String sql = "UPDATE employee SET name=? WHERE id=?";
            // JDBC connection
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/app?","root","root");
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, name);
                
                stmt.setInt(2, id);
                int rowsUpdated = stmt.executeUpdate();

                if (rowsUpdated > 0) {
                    out.println("<h3 style='color:green;'>Employee updated successfully!</h3>");
                } else {
                    out.println("<h3 style='color:red;'>No Employee found with ID: " + id + "</h3>");
                }
            }
            
            } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Invalid number format.</h3>");
        } catch (ClassNotFoundException e) {
            out.println("<h3 style='color:red;'>JDBC Driver not found.</h3>");
        } catch (SQLException e) {
            out.println("<h3 style='color:red;'>Database error: " + e.getMessage() + "</h3>");
        }
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
