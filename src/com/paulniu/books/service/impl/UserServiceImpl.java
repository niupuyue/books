package com.paulniu.books.service.impl;

import com.paulniu.books.dao.IUserDao;
import com.paulniu.books.dao.impl.UserDaoImpl;
import com.paulniu.books.domain.User;
import com.paulniu.books.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    IUserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return userDao.findAllUsers();
    }

    @Override
    public User login(User user) {
        return userDao.login(user.getUsername(),user.getPassword());
    }
}
