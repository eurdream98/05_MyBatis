package com.ohgiraffers.section01;

import java.util.List;

public class ResultView {
    public void susccessSelectAllMenu(List<MenuDTO> menuList) {
        System.out.println("==== Success ====");
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    public void errorMessage(String errorCode) {
        String errorMessage = "";
        System.out.println("==== Error ====");
        switch (errorCode){
            case "selectAll" :
                errorMessage = "메뉴 전체조회 실패!";
            break;
            case "selectOne":
                errorMessage = "메뉴 조회 실패!";
                break;
            case "insert":
                errorMessage = "메뉴 추가 실패!";
                break;
            case "update":
                errorMessage = "메뉴 수정 실패!";
                break;
            case "delete":
                errorMessage="메뉴 삭제 실패!";
                break;
        }
        System.out.println(errorMessage);
    }

    public void susccessSelectMenuMenuCode(MenuDTO menu) {
        System.out.println("==== Success ====");
        System.out.println(menu);
    }

    public void successMessage(String successCode) {
        String successMessage = "";
        System.out.println("====  Success ====");
        switch(successCode){
            case "insert":
                successMessage="메뉴 추가에 성공하였습니다!";
                        break;
            case "update":
                successMessage="메뉴 수정에 성공하였습니다!";
                break;
            case "delete":
                successMessage="메뉴 삭제에 성공하였습니다!";
                break;
        }
        System.out.println(successMessage);
    }
}
