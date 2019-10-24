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

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user, map);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // 调用Service保存数据
        IUserService userService = new UserServiceImpl();
        int count = userService.regist(user);
        if (count > 0) {
            // 跳转到登录页面
            resp.sendRedirect(req.getContextPath() + "/loginui");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
