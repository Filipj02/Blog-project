package Servlets;

import com.example.blogproject.dao.Dao;
import com.example.blogproject.entity.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditPostServlet", value = "/edit_post")
public class EditPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("logged") != null) {
            Long id = Long.valueOf(request.getParameter("id"));
            Post post = Dao.loadById(Post.class, id);
            request.setAttribute("post", post);

            request.
                    getServletContext().
                    getRequestDispatcher("/WEB-INF/views/edit.jsp").
                    forward(request, response);
            request.getSession().setAttribute("id", id);
        }else{
            response.sendRedirect("/");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newTitle = request.getParameter("title");
        String newContent = request.getParameter("content");
        System.out.println(newTitle);
        Long id = Long.parseLong(request.getParameter("id"));

        Post post = Dao.loadById(Post.class, id);
        post.setTitle(newTitle);
        post.setDescription(newContent);
        Dao.update(post);
        response.sendRedirect("/");
    }
}
