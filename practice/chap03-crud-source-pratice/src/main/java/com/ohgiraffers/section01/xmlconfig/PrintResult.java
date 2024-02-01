package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList) {
        for(MenuDTO a :menuList){
            System.out.println(a);
        }
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage="";
        switch(errorCode){
            case "selectList":
                errorMessage="메뉴 목록 조회에 실패하였습니다.";
            break;
        }
        System.out.println(errorMessage);
    }


}
