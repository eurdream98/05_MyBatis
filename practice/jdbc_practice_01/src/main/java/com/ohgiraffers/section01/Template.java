package com.ohgiraffers.section01;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Template {


    static Connection getConnection(){
        Connection con ;
        Properties prop = new Properties();
        try {
            prop.load(new FileReader("src/main/java/com/ohgiraffers/section01/config/jdbc-config.properties"));
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");
            Class.forName(driver);
             con = DriverManager.getConnection(url,user,password);
             con.setAutoCommit(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    static void close(Connection con){
        try {
            if(con!=null && !con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void close(Statement stmt){
        try {
            if(stmt!=null && !stmt.isClosed()){
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void close(ResultSet rest){
        try {
            if(rest!=null && !rest.isClosed()){
                rest.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
