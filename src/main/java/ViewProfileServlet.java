import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {

//    grabs info that has been redirected to this url /profile
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        getting the information or attributes we currently have set on our
//        session: isAdmin, username, password
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

//        if they are not a logged in user, redirect them to the profile page
        if(username == null){
            response.sendRedirect("/login");
            return;
        } else {
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request,
                    response);
        }
    }
}
