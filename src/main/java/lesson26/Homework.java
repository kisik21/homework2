package lesson26;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// save-request.jsp
@WebServlet("/save-request")
public class Homework extends HttpServlet {
    private Pattern patternEmail, patternNumber;

    @Override
    public void init() throws ServletException {
        patternEmail = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$");
        patternNumber = Pattern.compile("^[0-9]{5,14}$");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        PrintWriter printWriter = resp.getWriter();
        String email = req.getParameter("email");
        String city = req.getParameter("city");
        String number = req.getParameter("number");
        if (!name.isEmpty() && !email.isEmpty() && !city.isEmpty() && !number.isEmpty()) {
            Matcher matcherEmail = patternEmail.matcher(email), matcherNumber = patternNumber.matcher(number);
            if(matcherEmail.find()&&matcherNumber.find())
            {
                printWriter.write("Successful \nName: "+ name +"\nE-mail: "+ email +"\nCity: "+ city +"\nNumber: "+ number);
            }
            else {
                failure("Incorrect email or number", resp);
            }
        }
        else {
            failure("Some field are empty",resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.getRequestDispatcher("/save-request.jsp").forward(req, resp);
        }
        catch (ServletException | IllegalStateException e) {
            throw new RuntimeException(e);
        }

    }

    private void failure(String error, HttpServletResponse resp) throws IOException {

        resp.sendRedirect("save-request.jsp?error="+error);
    }
}