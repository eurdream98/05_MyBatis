package com.ohgiraffers.section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section01.Template.getSqlSession;
import static com.ohgiraffers.section01.Template.sqlSessionFactory;

public class MenuService {

    private static SqlSession sqlSession;
    MenuMapper menuMapper;

    public List<MenuDTO> selectMenuMenuPrice(Map<String,Integer> parameter) {
        sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);

        return menuMapper.selectMenuMenuPrice(parameter);
    }

    public List<MenuDTO> selectMenuCriteria(Criteria criteria) {
        sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        return menuMapper.selectMenuCriteria(criteria);
    }
}
