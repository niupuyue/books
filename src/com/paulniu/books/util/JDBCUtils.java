package com.paulniu.books.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 1.声明静态数据源成员变量
 * 2.创建连接池对象
 * 3.定义公有的得到数据源的方法
 * 4.定义得到连接对象的方法
 * 5.定义关闭资源的方法
 */
public class JDBCUtils {

    // 声明静态数据源成员变量
    private static DataSource dataSource;

    // 静态代码矿创建连接池对象
    static {
        // 加载配置信息
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
            //创建连接池对象，使用配置文件中的参数
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 定义公有方法得到数据源方法
     */
    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 定义得到连接对象的方法
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 定义关闭资源的方法
     */
    public static void close(Connection conn, Statement stmt, ResultSet set) {
        if (set != null) {
            try {
                set.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 重载一个关闭方法
     */
    public static void close(Connection conn, Statement stmt) {
        close(conn, stmt, null);
    }

}
