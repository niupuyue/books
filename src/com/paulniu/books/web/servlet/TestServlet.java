package com.paulniu.books.web.servlet;

import com.paulniu.books.dao.IBookDao;
import com.paulniu.books.dao.impl.BookDaoImpl;
import com.paulniu.books.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        IBookDao bookDao = new BookDaoImpl();
        List<Book> bookList = bookDao.findAllBook();
        System.out.println(bookList.size());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
