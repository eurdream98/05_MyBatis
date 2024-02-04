package com.ohgiraffers;

import org.apache.ibatis.annotations.Mapper;
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
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";
    private static SqlSessionFactory sqlSessionFactory;


    public static SqlSession getSqlSession(){

        if(sqlSessionFactory ==null){
            String resource = "com/ohgiraffers/config.xml";
            InputStream inputStream = null;
            try {
                inputStream = Resources.getResourceAsStream(resource);
                /*SqlSessionFactoryBuilder를 SqlSessionFactory를 생성한 후에도 유지할 필요는 없다.
                 * 따라서 메소드 스코프로 만든다.*/
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        /*SqlSession은 Thread에 안전하지 않고 공유되지 않아야하므로 요청 시마다 생성한다.*/
        SqlSession sqlSession = sqlSessionFactory.openSession(false);


        return sqlSession;
    }
}
