package com.paulniu.books.dao;

import com.paulniu.books.domain.User;

import java.util.List;

public interface IUserDao {

    /**
     * 获取所有用户列表
     *
     * @return
     */
    List<User> findAllUsers();

    /**
     * 登录
     *
     * @param name
     * @param password
     * @return
     */
    User login(String name, String password);

    /**
     * 退出登录
     *
     * @param name
     * @return
     */
    User logout(String name);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除用户
     */
    User deleteUser(User user);

    /**
     * 根据用户名查找用户
     */
    User findUserByName(String username);


}
