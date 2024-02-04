package com.ohgiraffers.section01;

import java.util.List;
import java.util.Map;

public class MenuController {
    private static MenuService menuService=new MenuService();
    private static ResultView resultView = new ResultView();
    public void selectAllMenu() {
        List<MenuDTO> menuList = menuService.selectAllMenu();
        if(menuList != null && !menuList.isEmpty()){
            resultView.susccessSelectAllMenu(menuList);
        }else{
            resultView.errorMessage("selectAll");
        }
    }

    public void selectMenuMenuCode(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));
        MenuDTO menu = menuService.selectMenuMenuCode(menuCode);
        if(menu != null){
            resultView.susccessSelectMenuMenuCode(menu);
        }else{
            resultView.errorMessage("selectOne");
        }
    }

    public void insertMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setMenuName(parameter.get("menuName"));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
        menu.setOrderableStatus(parameter.get("orderableStatus"));
        if(menuService.insertMenu(menu)){
            resultView.successMessage("insert");
        }else{
            resultView.errorMessage("insert");
        }
    }

    public void updateMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();
        menu.setMenuCode(Integer.parseInt(parameter.get("menuCode")));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setMenuName(parameter.get("menuName"));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
        menu.setOrderableStatus(parameter.get("orderableStatus"));
        if(menuService.updateMenu(menu)){
            resultView.successMessage("update");
        }else{
            resultView.errorMessage("update");
        }
    }

    public void deleteMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();
        menu.setMenuCode(Integer.parseInt(parameter.get("menuCode")));
        if(menuService.deleteMenu(menu)){
            resultView.successMessage("delete");
        }else{
            resultView.errorMessage("delete");
        }
    }
}
