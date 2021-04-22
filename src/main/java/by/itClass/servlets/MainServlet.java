package by.itClass.servlets;

import by.itClass.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainServlet", urlPatterns = {"/main"})
public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "Hello Java Web from IT Class!";
        RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
        User user = new User(1, "alex1993", "Alexander");

        request.setAttribute("message", str);
        request.setAttribute("us", user);
        rd.forward(request, response);
    }
}
