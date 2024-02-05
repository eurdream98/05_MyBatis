package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.jdbc.SQL;

public class SqlBuilderProvider {

    public String insertMenu(MenuDTO menuDTO) {
        SQL sql = new SQL();

        sql.INSERT_INTO("tbl_menu")
                .VALUES("menu_name", "#{ menuName }")
                .VALUES("menu_price", "#{ menuPrice }")
                .VALUES("category_code", "#{ categoryCode }")
                .VALUES("orderable_status", "#{ orderableStatus }");

        return sql.toString();
    }

    public String updateMenu(MenuDTO menuDTO) {
        SQL sql = new SQL();


        sql.UPDATE("tbl_menu");


        if(menuDTO.getMenuName() !=null && !"".equals(menuDTO.getMenuName())){
            sql.SET("menu_name= #{menuName}");
        }

        if(menuDTO.getMenuPrice()>0){
            sql.SET("menu_price=#{menuPrice}");
        }

        if(menuDTO.getCategoryCode()>0){
            sql.SET("category_code=#{categoryCode}");
        }

        if(menuDTO.getMenuName() !=null && !"".equals(menuDTO.getMenuName())){
            sql.SET("orderable_status=#{orderableStatus}");
        }

        sql.WHERE("menu_code=#{menuCode}");

        return sql.toString();
    }

    public String deleteMenu(){
        SQL sql = new SQL();

        sql.DELETE_FROM("tbl_menu")
                .WHERE("menu_code=#{menuCode}");
        return sql.toString();
    }
}
