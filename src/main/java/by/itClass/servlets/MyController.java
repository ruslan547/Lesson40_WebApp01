package by.itClass.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyController", urlPatterns = {"/myCont"}, loadOnStartup = 0)
public class MyController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet doGet");
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");
        super.init();
    }
}
