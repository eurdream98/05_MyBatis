package com.ohgiraffers.mapper.section01;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Mapper {
    @Results(id="resultMap",value ={
    @Result(id=true,property = "menuCode",column = "menu_code"),
    @Result(property = "menuName",column="menu_name"),
            @Result(property = "menuPrice",column="menu_price"),
            @Result(property = "categoryCode",column="category_code"),
            @Result(property = "orderableStatus",column="orderable_status")}
    )
    @Select(
            " SELECT\n" +
                    "            *\n" +
                    "        FROM\n" +
                    "            tbl_menu\n" +
                    "        ORDER BY\n" +
                    "            menu_price"
    )
    List<MenuDTO> selectAllMenu();
    @ResultMap("resultMap")
    @Select(" SELECT\n" +
            "        *\n" +
            "        FROM\n" +
            "        tbl_menu\n" +
            "        WHERE\n" +
            "        menu_code=#{menuCode}\n" +
            "        ORDER BY\n" +
            "        menu_price")
    MenuDTO selectMenuMenuCode(int menuCode);


    @Insert("INSERT INTO\n" +
            "        tbl_menu(menu_name,menu_price,category_code,orderable_status)\n" +
            "        VALUES\n" +
            "        (#{menuName},#{menuPrice},#{categoryCode},'Y')")
    int insertMenu(MenuDTO menu);


    @Update("UPDATE\n" +
            "        tbl_menu\n" +
            "        SET\n" +
            "        menu_name=#{menuName},\n" +
            "        menu_price=#{menuPrice},\n" +
            "        category_code=#{categoryCode},\n" +
            "        orderable_status = 'Y'\n" +
            "        WHERE\n" +
            "        menu_code = #{menuCode}")
    int updateMenu(MenuDTO menu);


    @Delete("DELETE\n" +
            "        FROM\n" +
            "        tbl_menu\n" +
            "        WHERE\n" +
            "        menu_code=#{menuCode}")
    int deleteMenu(MenuDTO menu);
}
