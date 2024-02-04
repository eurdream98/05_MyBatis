package com.ohgiraffers.section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class MenuDAO {

    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {
        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }

    public MenuDTO selectMenuMenuCode(SqlSession sqlSession,int menuCode) {
        return sqlSession.selectOne("MenuMapper.selectMenu",menuCode);
    }

    public int insertMenu(MenuDTO menu, SqlSession sqlSession) {
        return sqlSession.insert("MenuMapper.insertMenu",menu);
    }

    public int updateMenu(MenuDTO menu, SqlSession sqlSession) {
        return sqlSession.update("MenuMapper.updateMenu",menu);
    }

    public int deleteMenu(MenuDTO menu, SqlSession sqlSession) {
        return sqlSession.delete("MenuMapper.deleteMenu",menu);
    }
}
