package by.itClass.servlets;

import javax.servlet.RequestDispatcher;
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
//        RequestDispatcher rd = request.getRequestDispatcher("/form.html");
//        rd.forward(request, response);

//        response.sendRedirect("/webapp1/form.html");
        response.sendRedirect("http://vk.com");
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
