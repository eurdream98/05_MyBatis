package com.ohgiraffers.section02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static com.ohgiraffers.section02.Template.close;
import static com.ohgiraffers.section02.Template.getConnection;


public class MenuService {
    MenuDAO menuDAO = new MenuDAO();


    public List<MenuDTO> selectAllMenu() {
        Connection con = getConnection();
        List<MenuDTO> menuList;
        menuList = menuDAO.selectAllMenu(con);
        close(con);
        return menuList;
    }

    public MenuDTO selectMenuMenuCode(int menuCode) {
        Connection con = getConnection();
       MenuDTO menu =  menuDAO.selecMenuMenuCode(con,menuCode);
       close(con);
       return menu;
    }

    public int insertMenu(MenuDTO menuDTO) {
        Connection con = getConnection();
        int result = menuDAO.insertMenu(con,menuDTO);
        if(result>0){
            try {
                con.commit();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                con.rollback();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public int updateMenu(MenuDTO menu) {
        Connection con = getConnection();
        int result= menuDAO.updateMenu(menu,con);

        if(result>0){
            try {
                con.commit();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                con.rollback();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(con);
        return result;
    }

    public int deleteMenu(int menuCode) {
        Connection con = getConnection();
        int result = menuDAO.deleteMenu(con,menuCode);
        if(result>0){
            try {
                con.commit();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                con.rollback();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(con);
        return result;
    }
}
