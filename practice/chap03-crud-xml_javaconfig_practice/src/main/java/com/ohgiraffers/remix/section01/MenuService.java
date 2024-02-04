package com.ohgiraffers.remix.section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.remix.section01.Template.getSqlSession;

public class MenuService {

    public List<MenuDTO> selectAllMenu() {
        SqlSession sqlSession = getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        List<MenuDTO> menuList = mapper.selectAllMenu();

        sqlSession.close();
        return menuList;
    }

    public MenuDTO selectMenuMenuCode(int menuCode) {

        SqlSession sqlSession = getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        MenuDTO menu = mapper.selectMenuMenuCode(menuCode);

        sqlSession.close();
        return menu;
    }

    public boolean insertMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();
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
        boolean isTrue=false;
        SqlSession sqlSession = getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        int result = mapper.updateMenu(menu);
        if(result>0){
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

        boolean isTrue=false;
        SqlSession sqlSession = getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        int result = mapper.deleteMenu(menu);
        if(result>0){
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
