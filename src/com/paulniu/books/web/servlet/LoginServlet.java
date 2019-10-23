package com.paulniu.books.web.servlet;

import com.paulniu.books.domain.User;
import com.paulniu.books.service.IUserService;
import com.paulniu.books.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Map<String,String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        }catch (IllegalAccessException ex){
            ex.printStackTrace();
        }catch (InvocationTargetException ex){
            ex.printStackTrace();
        }

        // 使用service查询对象
        IUserService userService = new UserServiceImpl();
        User loginUser = userService.login(user);
        if (loginUser != null){
            // 登录成功
            // 将用户信息存入session中
            session.setAttribute("user",loginUser);
            resp.sendRedirect(req.getContextPath()+"index.jsp");
        }else {
            // 登陆失败
            req.setAttribute("login_msg","用户信息输入有误！");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
