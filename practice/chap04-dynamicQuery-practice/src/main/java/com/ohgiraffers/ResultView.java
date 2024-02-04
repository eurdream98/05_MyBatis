package com.ohgiraffers;

import java.util.List;

public class ResultView {

    public void successSelect(List<MenuDTO> menuList) {
        System.out.println("==== suceess ====");
        for(MenuDTO a:menuList){
            System.out.println(a);
        }
    }

    public void errorMessage(String errorCode) {
        String errormessage="";
        switch (errorCode){
            case "select":
                errormessage="메뉴 추천이 올바르게 작동하지 않았습니다.";
                break;
            default:break;
        }
        System.out.println(errormessage);
    }
}
