package TOBA;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The New Customer Servlet handles new user registration.
 * It takes data from the the New Customer form and puts into a user object.
 * It provides validation that fields on New_customer.html or New_customer.jsp
 * are not null or empty.
 * On successful registration it forwards to Success.jsp and on failure it fowards
 * to New_customer.jsp to provide a popup that alerts the user some fields were
 * empty.
 * @author jhronek
 */
public class NewCustomerServlet extends HttpServlet {

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
        
        // Get parameters from the New Customer form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("email");
        
        // Create a new user using all parameters
        User user = new User(firstName, lastName, phone, address, city, state, zipcode, email);
        
        // Set attribute for user and create default url string for forwarding
        request.setAttribute("user", user);
        String url = "/New_customer.jsp";
        try {
            // Checks if any of the fields are null or empty
            if (firstName == null || lastName == null || phone == null ||
                    address == null || city == null || state == null ||
                    zipcode == null || email == null || firstName.isEmpty() ||
                    lastName.isEmpty() || phone.isEmpty() || address.isEmpty() ||
                    city.isEmpty() || state.isEmpty() || zipcode.isEmpty() ||
                    email.isEmpty()) {
                
                // Set url to go to New_customer.jsp
                url = "/New_customer.jsp";
                // HTML to add alert box in New_Customer.jsp
                String alertMessage = "<div class=\"alert alert-danger\">\n" +
"                            <strong>Alert!</strong>&nbsp;Please fill out all fields!\n</div>";
                request.setAttribute("alertMessage", alertMessage);
            }
            else {
                // Success if no fields are blank
                url = "/Success.jsp";
            }
            
            // Forwards to url based on success or failure of form
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
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
        return "Short description";
    }// </editor-fold>

}
