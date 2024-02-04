package com.ohgiraffers.section02;

import com.ohgiraffers.section01.MenuDAO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section02.Template.getSession;


public class MenuService {
    private static MenuDAO menuDAO= new MenuDAO();
    private static SqlSession sqlSession;
    public List<MenuDTO> selectAllMenu() {
        sqlSession = getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        List<MenuDTO> menuList = mapper.selectAllMenu();
        sqlSession.close();
        return menuList;
    }

    public MenuDTO selectMenuMenuCode(int menuCode) {
        sqlSession=getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        MenuDTO menu = mapper.selectMenuMenuCode(menuCode);
        sqlSession.close();
        return menu;
    }

    public boolean insertMenu(MenuDTO menu) {
        sqlSession=getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        int result = mapper.insertMenu(menu);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;

    }

    public boolean updateMenu(MenuDTO menu) {
        sqlSession=getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        int result = mapper.updateMenu(menu);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;
    }

    public boolean deleteMenu(MenuDTO menu) {
        sqlSession=getSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        int result = mapper.deleteMenu(menu);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;
    }
}
