package Servlets;

import com.example.blogproject.dao.Dao;
import com.example.blogproject.entity.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RemoveServlet", value = "/delete_post")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("logged") != null) {
            Long id = Long.valueOf(request.getParameter("id"));
            Post post = Dao.loadById(Post.class, id);
            request.setAttribute("post", post);
            request.
                    getServletContext().
                    getRequestDispatcher("/WEB-INF/views/remove.jsp").
                    forward(request, response);
            request.getSession().setAttribute("id", id);
        }else{
            response.sendRedirect("/");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        Post post = Dao.loadById(Post.class, id);
        if(request.getParameter("delete")!=null){Dao.delete(post);}
        response.sendRedirect("/");
    }
}
