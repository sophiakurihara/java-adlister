import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        counter += 1;
        res.getWriter().println("The current count is: " + counter);
    }
}
