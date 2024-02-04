package com.ohgiraffers.section01;

import java.util.List;

public class ResultView {
    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch(errorCode){
            case "selectMenuMenuPrice":
                errorMessage="메뉴 추천에 실패하였습니다.";break;
            case "selectMenuCriteria":
                errorMessage="메뉴 검색에 실패하였습니다.";break;
        }
        System.out.println(errorMessage);
    }

    public void successMessageSelectMenuMenuPrice(List<MenuDTO> menuList) {
        System.out.println("==== Success ====");
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }
}
