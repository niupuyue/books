package com.paulniu.books.dao.impl;

import com.paulniu.books.dao.IBookDao;
import com.paulniu.books.domain.Book;
import com.paulniu.books.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements IBookDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Book> findAllBook() {
        List<Book> books = null;
        try {
            String sql = "select * from tab_books";
            books = template.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> findAllBookByType(int btype) {
        return null;
    }

    @Override
    public List<Book> findAllBookByName(String name) {
        return null;
    }

    @Override
    public List<Book> findAllBookByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findAllBookByPublisher(String publisher) {
        return null;
    }
}
