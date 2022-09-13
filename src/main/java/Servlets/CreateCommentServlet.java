package Servlets;

import com.example.blogproject.dao.Dao;
import com.example.blogproject.entity.Comm;
import com.example.blogproject.entity.Post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateCommentServlet", value = "/create_comment")
public class CreateCommentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //captcha
        Long id = Long.parseLong(request.getParameter("id_post"));
        Post post = Dao.loadById(Post.class,id);

        String sesionCaptcha = (String)(request.getSession().getAttribute("captcha"));
        String captcha = request.getParameter("captcha");

        String username;
        if(request.getParameter("username") == null){
            username = "anonymous";
        }else{
            username = request.getParameter("username");
        }
        String description = request.getParameter("description");


        if(captcha.equals(sesionCaptcha) && description != null){
            response.getWriter().println("captcha ok");
            Comm comm = new Comm(post,username,description);
            Dao.save(comm);
            response.sendRedirect("show_post?id="+id);
        }else{
            response.getWriter().println("captcha nie ok");

        }
    }
}
