package Servlets;

import com.example.blogproject.dao.Dao;
import com.example.blogproject.entity.Comm;
import com.example.blogproject.entity.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowPostServlet", value = "/show_post")
public class ShowPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().setAttribute("captcha", "1234");
        Long id = Long.valueOf(request.getParameter("id"));
        Post post = Dao.loadById(Post.class, id);
        request.setAttribute("post", post);

        List<Comm> comms = Dao.loadAll(Comm.class);
        request.setAttribute("comms", comms);
        System.out.println(comms);
        request.
                getServletContext().
                getRequestDispatcher("/WEB-INF/views/post.jsp").
                forward(request, response);




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
