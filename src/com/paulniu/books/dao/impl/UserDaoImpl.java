package com.paulniu.books.dao.impl;

import com.paulniu.books.dao.IUserDao;
import com.paulniu.books.domain.Book;
import com.paulniu.books.domain.User;
import com.paulniu.books.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAllUsers() {
        List<User> users = null;
        try {
            String sql = "select * from tab_users";
            users = template.query(sql,new BeanPropertyRowMapper<User>(User.class));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return users;
    }

    @Override
    public User login(String name, String password) {
        User user = null;
        try {
            String sql = "select * from tab_users where username = ? and password = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), name, password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return user;
    }

    @Override
    public User logout(String name) {
        return null;
    }

    @Override
    public int addUser(User user) {
        //1.定义sql
        String sql = "insert into tab_users values(null,?,?,?,?,?,?,?,100)";
        //2.执行sql
        int count  = template.update(sql, user.getUsername(), user.getPassword(), user.getNickname(), user.getBirthday(), user.getAddress(), user.getTelephone(),user.getEmail());
        return count;
    }

    @Override
    public int deleteUser(User user) {
        // 定义Sql语句
        String sql = "delete from tab_users where userid = ?";
        int count = template.update(sql,user.getUid());
        return count;
    }

    @Override
    public List<User> findUserByName(String username) {
        List<User> users = new ArrayList<>();
        try {
            String sql = "select * from tab_users where username like ?";
            users = template.query(sql,new BeanPropertyRowMapper<User>(User.class), username);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return users;
    }
}
