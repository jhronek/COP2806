package TOBA;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The LoginServlet handles login requests from the Login.html page.
 * Successful Login directs to Account_activity.html and Failure directs to
 * Login_failure.html.
 * @author jhronek
 */
public class LoginServlet extends HttpServlet {

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
        
        try {
            // Forward to Account_activity.html if correct username and password - default jsmith@toba.com letmein for now
            if ((request.getParameter("username").equals("jsmith@toba.com")) && (request.getParameter("password").equals("letmein"))) {
                String url = request.getContextPath() + "/Account_activity.html";
                response.sendRedirect(url);
            }
            else {
                // Forward to Login_failure page if incorrect login
                String url = request.getContextPath() + "/Login_failure.html";
                response.sendRedirect(url);
            }
        }
        catch (Exception e) {
            System.out.println("e");
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
        processRequest(request, response);
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "This servlet handles login requests.";
    }// </editor-fold>

}

