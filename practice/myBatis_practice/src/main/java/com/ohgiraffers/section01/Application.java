package com.ohgiraffers.section01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    static MenuController menuController = new MenuController();
    public static void main(String[] args) {
        do{
            System.out.println("==== 전체메뉴 ====");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");

            Scanner sc= new Scanner(System.in);
            int no = sc.nextInt();

            switch(no){
                case 1: menuController.selectAllMenu();break;
                case 2: menuController.selectMenuMenuCode(insertMenuCode());break;
                case 3: menuController.insertMenu(insertMenuDTO());break;
                case 4: menuController.updateMenu(updateMenuDTO());break;
                case 5: menuController.deleteMenu(insertMenuCode());break;
                default:break;
            }
        }while(true);

    }

    private static Map<String,String> updateMenuDTO() {
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 코드를 입력해주세요");
        String menuCode = sc.nextLine();
        System.out.println("메뉴 이름을 입력해주세요");
        String menuName = sc.nextLine();
        System.out.println("메뉴 가격을 입력해주세요");
        String menuPrice = sc.nextLine();
        System.out.println("카테고리 코드를 입력해주세요");
        String categoryCode = sc.nextLine();
        System.out.println("판매 상태을 입력해주세요");
        String orderableStatus = sc.nextLine();
        map.put("menuCode",menuCode);
        map.put("menuPrice",menuPrice);
        map.put("menuName",menuName);
        map.put("categoryCode",categoryCode);
        map.put("orderableStatus",orderableStatus);
        return map;
    }

    private static Map<String,String> insertMenuDTO() {
       Map<String,String> map = new HashMap<>();
         Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 이름을 입력해주세요");
        String menuName = sc.nextLine();
        System.out.println("메뉴 가격을 입력해주세요");
        String menuPrice = sc.nextLine();
        System.out.println("카테고리 코드를 입력해주세요");
        String categoryCode = sc.nextLine();
        System.out.println("판매 상태을 입력해주세요");
        String orderableStatus = sc.nextLine();
        map.put("menuPrice",menuPrice);
        map.put("menuName",menuName);
        map.put("categoryCode",categoryCode);
        map.put("orderableStatus",orderableStatus);
        return map;
    }

    private static Map<String,String> insertMenuCode() {
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        System.out.println("메뉴 코드를 입력해주세요");
        String menuCode = sc.nextLine();
        map.put("menuCode",menuCode);
        return map;
    }
}
