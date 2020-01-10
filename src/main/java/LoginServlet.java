import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        this doGet grabs our login view to display
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        doPost runs once the form is submitted on /login
//        username and password parameters are pulled from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

//        this is the condition we are checking for redirect
        boolean validAttempt = username.equals("admin") && password.equals("password");

//        setting attributes on our session to remember throughout our
//        application
        request.getSession().setAttribute("isAdmin", false);
        request.getSession().setAttribute("username", username);
        request.getSession().setAttribute("password", password);

//        if conditions are met, they are an admin and can be sent to their
//        profile
        if (validAttempt) {
            request.getSession().setAttribute("isAdmin", true);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
