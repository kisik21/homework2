package lesson23;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.*;
import java.nio.charset.StandardCharsets;

// Написать приложение, которое при запуске будет сообщать в консоль что оно
//работает. На любой запрос в консоли должна отображаться запись со временем этого
//запроса.
//Создать 2 эндпоинта:
///book - который будет скачивать с сервера клиенту любую книгу.
///load-book - который позволит загружать свои книги на сервер

// url: localhost:8085/book?fileName=new_book.txt

@WebServlet(value = {"/book", "/load-book"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10) // 10 Mb
public class HomeworkServlet extends HttpServlet {
    private String path;
    private final String PATH = "C:\\Books\\";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        if (path.equals("/load-book")) {
            try {
                Part file = req.getPart("file");
                String filename = getFilename(file);
                InputStream filecontent = file.getInputStream();
                // ... Do your file saving job here.

                resp.setContentType("text/plain");
                resp.setCharacterEncoding("UTF-8");
                resp.getWriter().write("File " + filename + " successfully uploaded");

            } catch (IOException e) {
                resp.getWriter().print("error" + e.getMessage());
            }
        }
    }

    private static String getFilename(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
            }
        }
        return null;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        path = req.getServletPath();
        if (path.equals("/book")) {
            String fileName = req.getParameter("fileName");
            File file = new File(PATH + "/" + fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            OutputStream outputStream = resp.getOutputStream();
            resp.setContentType("text/plain");
            resp.setHeader("Content-Disposition", "attachment; filename=\"" + new String(fileName.getBytes(StandardCharsets.UTF_8)));
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
            outputStream.close();
            fileInputStream.close();
        }
    }
}