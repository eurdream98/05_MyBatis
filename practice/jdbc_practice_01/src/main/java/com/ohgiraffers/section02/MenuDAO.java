package com.ohgiraffers.section02;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.ohgiraffers.section02.Template.close;


public class MenuDAO {
    Properties prop=new Properties();
    MenuDAO(){
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section02/config/sql.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<MenuDTO> selectAllMenu(Connection con) {

        PreparedStatement pstmt=null;
        ResultSet rset=null;
        List<MenuDTO> menuList;
        MenuDTO menu;



        try {
            String query = prop.getProperty("selectAllMenu");
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
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
            close(pstmt);
            close(rset);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(pstmt);
            close(rset);
        }



        return  menuList;
    }

    public MenuDTO selecMenuMenuCode(Connection con, int menuCode) {
        PreparedStatement pstmt=null;
        ResultSet rset= null;
        MenuDTO menuDTO;

        try {

            String query=prop.getProperty("selectMenuMenuCode");
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,menuCode);
            rset=pstmt.executeQuery();
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
        }finally{
            close(pstmt);
            close(rset);
        }


       return menuDTO;
    }

    public int insertMenu(Connection con, MenuDTO menuDTO) {
        PreparedStatement pstmt=null;
        int result;
        String query = prop.getProperty("insert");
        try {
            String menuName = menuDTO.getMenuName();
            int menuPrice = menuDTO.getMenuPrice();
            int categoryCode = menuDTO.getCategoryCode();
            String orderableStatus = menuDTO.getOrderableStatus();

            pstmt=con.prepareStatement(query);
            pstmt.setString(1,menuName);
            pstmt.setInt(2,menuPrice);
            pstmt.setInt(3,categoryCode);
            pstmt.setString(4,orderableStatus);
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    public int updateMenu(MenuDTO menu, Connection con) {
        PreparedStatement pstmt=null;
        int result;
        String query = prop.getProperty("update");
        try {
            int menuCode = menu.getMenuCode();
            String menuName = menu.getMenuName();
            int menuPrice = menu.getMenuPrice();
            int categoryCode = menu.getCategoryCode();
            String orderableStatus = menu.getOrderableStatus();

            pstmt=con.prepareStatement(query);
            pstmt.setString(1,menuName);
            pstmt.setInt(2,menuPrice);
            pstmt.setInt(3,categoryCode);
            pstmt.setString(4,orderableStatus);
            pstmt.setInt(5,menuCode);
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(pstmt);
        }
        return result;
    }

    public int deleteMenu(Connection con,int menuCode) {
        PreparedStatement pstmt = null;
        int result;
        String query = prop.getProperty("delete");
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,menuCode);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(pstmt);
        }
        return result;
    }
}
