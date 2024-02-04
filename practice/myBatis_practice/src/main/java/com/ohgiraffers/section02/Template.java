package com.ohgiraffers.section02;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;

public class Template {
    static SqlSessionFactory sqlSessionFactory;

    private static String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static String URL ="jdbc:mysql://localhost/menudb";
    private static String USER ="ohgiraffers";
    private static String PASSWORD ="ohgiraffers";

    public static SqlSession getSession(){
        if(sqlSessionFactory==null) {
            Environment environment = new Environment(
                    "dev",
                    new JdbcTransactionFactory(),
                    new PooledDataSource(DRIVER, URL, USER, PASSWORD)
            );
            Configuration con = new Configuration(environment);
            con.addMapper(Mapper.class);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(con);
        }
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession;
    }
}
