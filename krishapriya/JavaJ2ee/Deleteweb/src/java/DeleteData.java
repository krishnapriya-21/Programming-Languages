/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class DeleteData extends HttpServlet {

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
            out.println("<title>Servlet DeleteData</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeleteData at " + request.getContextPath() + "</h1>");
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
        String idParam = request.getParameter("id");

        // Validate ID parameter
        if (idParam == null || !idParam.matches("\\d+")) {
            out.println("<h3>Invalid ID provided.</h3>");
            return;
        }
         int id = Integer.parseInt(idParam);
         try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
             // Connect to database
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/app?","root","root")) {

                String sql = "DELETE FROM employee WHERE id = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, id);
                      int rowsDeleted = stmt.executeUpdate();

                    if (rowsDeleted > 0) {
                        out.println("<h3>Record deleted successfully!</h3>");
                    } else {
                        out.println("<h3>No record found with ID: " + id + "</h3>");
                    }
                }
            }
             } catch (ClassNotFoundException e) {
            out.println("<h3>Database Driver not found: " + e.getMessage() + "</h3>");
        } catch (SQLException e) {
            out.println("<h3>Database error: " + e.getMessage() + "</h3>");
        }
    }

    

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
