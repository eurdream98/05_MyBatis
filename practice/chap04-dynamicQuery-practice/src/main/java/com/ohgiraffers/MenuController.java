package com.ohgiraffers;

import java.util.List;
import java.util.Map;

public class MenuController {
    MenuService menuService = new MenuService();
    ResultView resultView = new ResultView();
    public void selectSuitMenu(Map<String,String> map) {
        List<MenuDTO> menuList = menuService.selectSuitMenu(map);
        if(menuList!=null&&!menuList.isEmpty()){
            resultView.successSelect(menuList);
        }else{
            resultView.errorMessage("select");
        }
    }
}
