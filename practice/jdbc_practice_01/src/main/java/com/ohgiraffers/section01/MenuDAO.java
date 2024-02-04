package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.ohgiraffers.section01.Template.close;

public class MenuDAO {
    public List<MenuDTO> selectAllMenu(Connection con) {
        Statement stmt;
        ResultSet rset;
        List<MenuDTO> menuList;
        MenuDTO menu;
        try {
             stmt = con.createStatement();
             rset = stmt.executeQuery("SELECT * FROM tbl_menu");
             menuList = new ArrayList<>();
             while(rset.next()){
                 menu = new MenuDTO();
                 menu.setMenuCode(rset.getInt(1));
                 menu.setMenuName(rset.getString(2));
                 menu.setMenuPrice(rset.getInt(3));
                 menu.setCategoryCode(rset.getInt(4));
                 menu.setOrderableStatus(rset.getString(5));
                 menuList.add(menu);
             }
             close(stmt);
             close(rset);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  menuList;
    }

    public MenuDTO selecMenuMenuCode(Connection con,int menuCode) {
        Statement stmt;
        ResultSet rset;
        MenuDTO menuDTO;

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT * FROM tbl_menu WHERE menu_code="+menuCode);
            menuDTO = new MenuDTO();
            if(rset.next()){
                menuDTO.setMenuCode(rset.getInt(1));
                menuDTO.setMenuName(rset.getString(2));
                menuDTO.setMenuPrice(rset.getInt(3));
                menuDTO.setCategoryCode(rset.getInt(4));
                menuDTO.setOrderableStatus(rset.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return menuDTO;
    }

    public int insertMenu(Connection con, MenuDTO menuDTO) {
        Statement stmt;
        int result;
        try {
            String menuName = menuDTO.getMenuName();
            int menuPrice = menuDTO.getMenuPrice();
            int categoryCode = menuDTO.getCategoryCode();
            String orderableStatus = menuDTO.getOrderableStatus();
            stmt = con.createStatement();
            result = stmt.executeUpdate("INSERT INTO tbl_menu(menu_name,menu_price,category_code,orderable_status) " +
                    "VALUES('"+menuName+"',"+menuPrice+","+categoryCode+",'"+orderableStatus+"')");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        close(stmt);
        return result;
    }


    public int updateMenu(MenuDTO menu, Connection con) {
        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            int menuCode = menu.getMenuCode();
            String menuName =menu.getMenuName();
            int menuPrice = menu.getMenuPrice();
            int categoryCode = menu.getCategoryCode();
            String orderableStatus = menu.getOrderableStatus();

           result =  stmt.executeUpdate("UPDATE tbl_menu SET"+" menu_name='" +menuName+"',menu_price="+menuPrice+",category_code="+categoryCode+",orderable_status='"+orderableStatus+"' WHERE menu_code="+menuCode);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        close(stmt);
        return result;
    }

    public int deleteMenu(Connection con,int menuCode) {
        Statement stmt;
        int result;
        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate("DELETE FROM tbl_menu WHERE menu_code = "+menuCode);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
