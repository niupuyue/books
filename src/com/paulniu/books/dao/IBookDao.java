package com.paulniu.books.dao;

import com.paulniu.books.domain.Book;

import java.util.List;

public interface IBookDao {

    /**
     * 获取所有图书信息
     *
     * @return
     */
    public List<Book> findAllBook();

    /**
     * 根据分类获取所有图书信息
     */
    public List<Book> findAllBookByType(int btype);

    /**
     * 根据书名查找所有图书
     */
    public List<Book> findAllBookByName(String name);

    /**
     * 根据作者查找所有图书
     */
    public List<Book> findAllBookByAuthor(String author);

    /**
     * 根据出版商查找所有图书
     */
    public List<Book> findAllBookByPublisher(String publisher);

}
