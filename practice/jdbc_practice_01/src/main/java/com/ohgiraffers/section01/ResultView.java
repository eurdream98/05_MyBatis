package com.ohgiraffers.section01;

import java.util.List;

public class ResultView {
    public void succesMessageSelectAllMenu(List<MenuDTO> menuList) {
        System.out.println("==== Success ====");
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    public void errorMessage(String errorCode) {
        String errorMessage = "";
        System.out.println("==== Error ====");
        switch (errorCode){
            case "selectAll":
                errorMessage = "메뉴 전체 조회에 실패하였습니다."; break;
            case "selectOne":
                errorMessage = "메뉴 조회에 실패하였습니다."; break;
            case "insert" : errorMessage = "메뉴 입력에 실패하였습니다.";break;
            case "update" : errorMessage = "메뉴 수정에 실패하였습니다.";break;
            case "delete" : errorMessage = "메뉴 삭제에 실패하였습니다.";break;
            default:
                break;
        }
        System.out.println(errorMessage);
    }

    public void successMessage(String successCode) {
        String successMessage="";
        switch(successCode){
            case "insert" : successMessage = "메뉴 입력에 성공하였습니다.";break;
            case "update" : successMessage = "메뉴 수정에 성공하였습니다.";break;
            case "delete" : successMessage = "메뉴 삭제에 성공하였습니다.";break;
            default: break;
        }
        System.out.println(successMessage);
    }

    public void successMessageSelectOneMenu(MenuDTO menu) {
        System.out.println("====  suceess ====");
        System.out.println(menu);
    }
}
