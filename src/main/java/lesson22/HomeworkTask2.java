package lesson22;

//Задача 2:
//Создать сервлет который на вход принимает возраст, а в ответе возвращает
//информацию, совершеннолетний или нет.

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/age-info")
public class HomeworkTask2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        try(PrintWriter printWriter=resp.getWriter()) {
            String ageStr=req.getParameter("age");
            if (!ageStr.isEmpty() && ageStr.matches("\\d+")) {
                int age=Integer.parseInt(ageStr);
                if (age>18) {
                    printWriter.write("adult");  // url: localhost:8085/age-info?age=30
                } else printWriter.write("minor"); // url: localhost:8085/age-info?age=10
            } else printWriter.write("incorrect input");  // url: localhost:8085/age-info?age=dvadtsat
        }
    }
}
