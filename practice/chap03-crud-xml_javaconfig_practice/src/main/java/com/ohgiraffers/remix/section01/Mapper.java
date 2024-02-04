package com.ohgiraffers.remix.section01;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Mapper {

    List<MenuDTO> selectAllMenu();

    MenuDTO selectMenuMenuCode(int menuCode);


    int insertMenu(MenuDTO menu);



    int updateMenu(MenuDTO menu);

    int deleteMenu(MenuDTO menu);
}
