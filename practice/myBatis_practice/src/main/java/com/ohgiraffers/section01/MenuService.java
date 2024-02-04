package com.ohgiraffers.section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section01.Template.getSession;

public class MenuService {
    private static MenuDAO menuDAO= new MenuDAO();
    private static SqlSession sqlSession;
    public List<MenuDTO> selectAllMenu() {
        sqlSession = getSession();
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);
        sqlSession.close();
        return menuList;
    }

    public MenuDTO selectMenuMenuCode(int menuCode) {
        sqlSession = getSession();
        MenuDTO menu=menuDAO.selectMenuMenuCode(sqlSession,menuCode);
        sqlSession.close();
        return menu;
    }

    public boolean insertMenu(MenuDTO menu) {
        sqlSession = getSession();
        int result = menuDAO.insertMenu(menu,sqlSession);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;
    }

    public boolean updateMenu(MenuDTO menu) {
        sqlSession = getSession();
        int result = menuDAO.updateMenu(menu,sqlSession);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;
    }

    public boolean deleteMenu(MenuDTO menu) {
        sqlSession = getSession();
        int result = menuDAO.deleteMenu(menu,sqlSession);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;
    }
}
