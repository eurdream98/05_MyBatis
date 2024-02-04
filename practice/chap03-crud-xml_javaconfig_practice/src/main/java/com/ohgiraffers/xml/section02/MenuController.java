package com.ohgiraffers.xml.section02;

import java.util.List;
import java.util.Map;

public class MenuController {
private MenuService menuService = new MenuService();
private ViewResult viewResult=new ViewResult();
    public void selectAllMenu() {
        List<MenuDTO> menuList = menuService.selectAllMenu();
        if(menuList!=null){
            viewResult.successSelectList(menuList);
        }else{
            viewResult.errorMessage("select");
        }
    }

    public void selectMenuMenucode(Map<String,String> map) {
        int menuCode = Integer.parseInt(map.get("menuCode"));
        MenuDTO menu = menuService.selectMenuMenuCode(menuCode);
        if(menu!=null){
            viewResult.successSelectmenu(menu);
        }else{
            viewResult.errorMessage("selectOne");
        }

    }

    public void insertMenu(Map<String, String> parameter) {
       String menuName = parameter.get("menuName");
       int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
       int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

       MenuDTO menu = new MenuDTO();
       menu.setMenuName(menuName);
       menu.setMenuPrice(menuPrice);
       menu.setCategoryCode(categoryCode);

        if(menuService.insertMenu(menu)){
            viewResult.successMessage("insert");
        }else{
            viewResult.errorMessage("insert");
        }
    }


    public void updateMenu(Map<String, String> parameter) {
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setMenuCode(Integer.parseInt(parameter.get("menuCode")));
        menuDTO.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));
        menuDTO.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menuDTO.setMenuName(parameter.get("menuName"));
        if(menuService.updateMenu(menuDTO)){
            viewResult.successMessage("update");
        }else{
            viewResult.errorMessage("update");
        };
    }

    public void deleteMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();
        menu.setMenuCode(Integer.parseInt(parameter.get("menuCode")));
        if(menuService.deleteMenu(menu)){
            viewResult.successMessage("delete");
        }else{
            viewResult.errorMessage("delete");
        };
    }
}
