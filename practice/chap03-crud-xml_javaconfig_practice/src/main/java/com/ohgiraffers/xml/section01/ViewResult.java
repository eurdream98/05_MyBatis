package com.ohgiraffers.xml.section01;

import java.util.List;

public class ViewResult {
    public void successSelectList(List<MenuDTO> menuList) {
        System.out.println("====Success=====");
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    public void errorMessage(String erroecode) {
        System.out.println("====Error=====");
        String errormessage = "";
        switch (erroecode){
            case "select":
                errormessage="메뉴 전체 조회에 실패하였습니다";break;
            case "selectOne":
                errormessage="메뉴 조회에 실패하였습니다.";break;
            case "insert":
                errormessage="메뉴 추가에 실패하였습니다.";break;
            case "update":
                errormessage="메뉴 업데이트에 실패하였습니다.";break;
            case "delete":
                errormessage = "메뉴 삭제에 실패했습니다.";break;
            default: break;

        }
        System.out.println(errormessage);
    }

    public void successSelectmenu(MenuDTO menu) {
        System.out.println("====Success=====");
        System.out.println(menu);
    }

    public void successMessage(String successCode) {
        System.out.println("===Success=====");
        String successMessage="";
        switch (successCode){
            case "insert":
                successMessage="메뉴 추가에 성공하였습니다!";
            case "update":
                successMessage="메뉴 업데이트에 성공하였습니다!";
            case "delete":
                successMessage="메뉴 삭제에 성공하였습니다!";
            default: break;
        }
        System.out.println(successMessage);
    }
}
