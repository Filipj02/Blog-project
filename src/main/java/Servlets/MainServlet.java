package Servlets;

import com.example.blogproject.dao.Dao;
import com.example.blogproject.entity.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MainServlet", value = "/")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Post> posts = Dao.loadAll(Post.class);
        request.setAttribute("posts", posts);
        request.
                getServletContext().
                getRequestDispatcher("/WEB-INF/views/index.jsp").
                forward(request, response);

        if(request.getSession().getAttribute("logged").equals("Admin")){
            System.out.println("zalogowano jako admin");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
