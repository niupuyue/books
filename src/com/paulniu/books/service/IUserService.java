package com.paulniu.books.service;

import com.paulniu.books.domain.User;

import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface IUserService {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    /**
     * 登录方法
     */
    User login(User user);



}
