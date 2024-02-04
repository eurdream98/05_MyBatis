package com.ohgiraffers.xml.section02;


import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.xml.section02.Template.getSqlSession;

public class MenuService {
    private MenuDAO menuDAO=new MenuDAO();
    public List<MenuDTO> selectAllMenu() {
        SqlSession sqlSession = getSqlSession();
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);
        sqlSession.close();
        return menuList;
    }

    public MenuDTO selectMenuMenuCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();
        MenuDTO menuDTO = menuDAO.selectMenuMenuCode(sqlSession,menuCode);
        sqlSession.close();
        return menuDTO;
    }

    public boolean insertMenu(MenuDTO menu) {
        boolean isTrue = false;
        SqlSession sqlSession = getSqlSession();
        int result1 = menuDAO.insertMenu(sqlSession,menu);
        if(result1>0){
            sqlSession.commit();
            isTrue=true;
        }else{
            sqlSession.rollback();
            isTrue=false;
        }
        sqlSession.close();
        return isTrue;
    }

    public boolean updateMenu(MenuDTO menuDTO) {
        boolean isTrue = false;
        SqlSession sqlSession = getSqlSession();
        int result1 = menuDAO.updateMenu(sqlSession,menuDTO);
        if(result1>0){
            sqlSession.commit();
            isTrue=true;
        }else{
            sqlSession.rollback();
            isTrue=false;
        }
        sqlSession.close();
        return isTrue;
    }

    public boolean deleteMenu(MenuDTO menu) {
        boolean isTrue = false;
        SqlSession sqlSession = getSqlSession();
        int result1 = menuDAO.deleteMenu(sqlSession,menu);
        if(result1>0){
            sqlSession.commit();
            isTrue=true;
        }else{
            sqlSession.rollback();
            isTrue=false;
        }
        sqlSession.close();
        return isTrue;
    }
}
