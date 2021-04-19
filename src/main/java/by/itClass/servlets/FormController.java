package by.itClass.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FormController", urlPatterns = {"/formCont"})
public class FormController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String param1 = request.getParameter("param1");
        String ch1 = request.getParameter("ch1");
        String ch2 = request.getParameter("ch2");
        String ch3 = request.getParameter("ch3");

        String radio1 = request.getParameter("radio1");

        writer.append("method POST");
        writer.append("\nparam1=" + param1);
        writer.append("\nch1=" + ch1);
        writer.append("\nch2=" + ch2);
        writer.append("\nch3=" + ch3);
        writer.append("\nradio1=" + radio1);
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String param1 = request.getParameter("param1");
        writer.append("method GET");
        writer.append("param1=" + param1);

        // Method getParameterValues returns array of values for inputs with its name
        String[] params = request.getParameterValues("param1");

        //Method getParMap returns set of couple key:value, where
        //key - name of property, value - value for this name
        Map<String, String[]> paramMap = request.getParameterMap();
        String[] someParams = paramMap.get("param1");

        writer.close();
    }
}
