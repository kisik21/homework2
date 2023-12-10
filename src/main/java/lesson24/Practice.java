package lesson24;

//

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/verse")
public class Practice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            getServletContext().getRequestDispatcher("/verse.html").forward(req, resp);
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/verse.html");
//            dispatcher.forward(req, resp);
        }
        catch (ServletException e) {
            throw new RuntimeException(e);
        }


    }

}
