package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession(){
        if(sqlSessionFactory==null){
            String resources = "com/ohgiraffers/section01/xmlconfig/mybatis-config.xml";
            try {
                InputStream inputStream = Resources.getResourceAsStream(resources);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession;
    }
}
