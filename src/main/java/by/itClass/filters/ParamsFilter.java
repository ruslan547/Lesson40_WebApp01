package by.itClass.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebFilter(filterName = "ParamsFilter", urlPatterns = {"/myCont", "/formCont"}) // or servletNames
public class ParamsFilter implements Filter {
    public void destroy() {
        System.out.println("filter destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter doFilter");
        Map<String, String[]> params = req.getParameterMap();
        boolean isNonRedirect = params.values()
                                .stream()
                                .flatMap(Arrays::stream)
                                .anyMatch(param -> param.isEmpty());

        if (isNonRedirect) {
            resp.getWriter().append("Params are empty");
            return;
        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter init");
    }

}
