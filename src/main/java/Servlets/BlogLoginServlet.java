package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BlogLoginServlet", value = "/login")
public class BlogLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.
                getServletContext().
                getRequestDispatcher("/WEB-INF/views/bloglogin.jsp").
                forward(request, response);
        request.getSession().setAttribute("message","");



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login.equals("Admin") && password.equals("1")) {
            request.getSession().setAttribute("logged", "Admin");
            response.sendRedirect("/");

        } else{response.sendRedirect("/login");
        request.getSession().setAttribute("message","Zły login lub hasło");

        }


        }

    }

