package com.ohgiraffers.section01;

import java.util.List;
import java.util.Map;

public class MenuController {
    private static MenuService menuService = new MenuService();
    private static ResultView resultView = new ResultView();

    public void selectMenuMenuPrice(Map<String, Integer> parameter) {
        MenuDTO menu = new MenuDTO();
        List<MenuDTO> menuList = menuService.selectMenuMenuPrice(parameter);
        if(menuList!=null && !menuList.isEmpty()){
            resultView.successMessageSelectMenuMenuPrice(menuList);
        }else{
            resultView.errorMessage("selectMenuMenuPrice");
        }
    }

    public void selectMenuCriteria(Criteria criteria) {

        List<MenuDTO> menuList = menuService.selectMenuCriteria(criteria);
        if(menuList!=null&&!menuList.isEmpty()){
            resultView.successMessageSelectMenuMenuPrice(menuList);
        }else{
            resultView.errorMessage("selectMenuCriteria");
        }
    }
}
