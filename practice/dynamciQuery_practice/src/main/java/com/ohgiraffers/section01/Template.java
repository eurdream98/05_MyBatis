package com.ohgiraffers.section01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {
    static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){
        InputStream inputStream;
        if(sqlSessionFactory==null){
            try {
                inputStream = Resources.getResourceAsStream("config-info.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession;
    }
}
