package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class MenuController {
    private MenuService menuService;
    private PrintResult printResult;
    MenuController(){
        menuService=new MenuService();
        printResult=new PrintResult();
    }
    public void selectAllMenu() {
        List<MenuDTO> menuList =  menuService.selectAllMenu();
        if(menuList!=null){
            printResult.printMenuList(menuList);
        }else{
            printResult.printErrorMessage("selectList");
        }
    }
}
