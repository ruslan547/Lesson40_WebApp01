package by.itClass.servlets;

import by.itClass.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns = {"/list"})
public class ListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = Arrays.asList("Java", "C#", "C++", "JavaScript", "HTML");
        List<User> users = Arrays.asList(
                new User(1, "login1", "name1"),
                new User(2, "login2", "name2"),
                new User(3, "login3", "name3")
        );

        request.setAttribute("list", list);
        request.setAttribute("users", users);

        RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
        rd.forward(request, response);
    }
}
