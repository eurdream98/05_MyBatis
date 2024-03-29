package com.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Template {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSession(){
        InputStream inputStream;
        if(sqlSessionFactory==null){
            try {
                inputStream = Resources.getResourceAsStream("config/mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        SqlSession sqlSession =sqlSessionFactory.openSession(false);
        return sqlSession;
    }

}
