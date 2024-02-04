package com.ohgiraffers.xml.section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {
    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {
        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }

    public MenuDTO selectMenuMenuCode(SqlSession sqlSession, int menuCode) {
        return sqlSession.selectOne("MenuMapper.selectOne",menuCode);
    }

    public int insertMenu(SqlSession sqlSession, MenuDTO menu) {
        return sqlSession.insert("MenuMapper.insert",menu);
    }

    public int updateMenu(SqlSession sqlSession, MenuDTO menuDTO) {
        return sqlSession.update("MenuMapper.update",menuDTO);
    }

    public int deleteMenu(SqlSession sqlSession, MenuDTO menu) {
        return sqlSession.delete("MenuMapper.delete",menu);
    }
}
