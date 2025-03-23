package com.example.lab1;

import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet(name = "stanislavServlet", value = "/stanislav")
public class StanislavServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Stanislav Palamar</title>");
        out.println("<link rel=\"stylesheet\" href=\"css/styles.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Stanislav Palamar</h1>");
        out.println("<p>Member of the team</p>");
        out.println("<p>Role: Developer</p>");
        out.println("<p><a href=\"https://github.com/\" target=\"_blank\">GitHub Profile</a></p>");
        out.println("<p><a href=\"index.html\">Back to main page</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
