package com.ohgiraffers.section01;

import java.util.List;
import java.util.Scanner;

public class MenuController {
    static MenuService menuService = new MenuService();

    static ResultView resultView = new ResultView();

    public void selectAllMenu() {
        List<MenuDTO> menuList = menuService.selectAllMenu();
        if(menuList!=null&&!menuList.isEmpty()){
            resultView.succesMessageSelectAllMenu(menuList);
        }else{
            resultView.errorMessage("selectAll");
        }
    }


    public void selectMenuMenuCode(int menuCode) {
        MenuDTO menu = menuService.selectMenuMenuCode(menuCode);
        if(menu!=null){
            resultView.successMessageSelectOneMenu(menu);
        }else{
            resultView.errorMessage("selectOne");
        }
    }

    public void insertMenu(MenuDTO menuDTO) {
        int result = menuService.insertMenu(menuDTO);
        if(result>0){
            resultView.successMessage("insert");
        }else{
            resultView.errorMessage("insert");
        }
    }

    public void updateMenu(MenuDTO menu){
        int result = menuService.updateMenu(menu);
        if(result>0){
            resultView.successMessage("update");
        }else{
            resultView.errorMessage("update");
        }

    }

    public void deleteMenu(int menuCode) {
        int result = menuService.deleteMenu(menuCode);
        if(result>0){
            resultView.successMessage("delete");
        }else{
            resultView.errorMessage("delete");
        }
    }
}
