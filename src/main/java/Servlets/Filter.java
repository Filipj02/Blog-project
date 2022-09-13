package Servlets;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {

    private final String encoding = "UTF-8";
    private final String content = "text/html";

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(request, response);

        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        response.setContentType(content);
        chain.doFilter(request, response);
    }
}
