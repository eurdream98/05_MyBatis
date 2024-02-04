package com.ohgiraffers.section03;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectAllMenu();

MenuDTO selectMenuMenuCode(int menuCode);


    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(MenuDTO menu);
}
