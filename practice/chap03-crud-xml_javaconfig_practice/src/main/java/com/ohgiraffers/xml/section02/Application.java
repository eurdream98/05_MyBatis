package com.ohgiraffers.xml.section02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        MenuController menuController=new MenuController();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("==== 메뉴 선택 ====");
            System.out.println("1. 메뉴 전체 선택");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("=================");
            System.out.println("===번호를 선택=====");
            int no = sc.nextInt();

            switch (no){
                case 1: menuController.selectAllMenu();break;
                case 2: menuController.selectMenuMenucode(insertMenuCode()); break;
                case 3: menuController.insertMenu(insertMenuList());break;
                case 4: menuController.updateMenu(updateMenuList());break;
                case 5: menuController.deleteMenu(deleteMenuList());break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다."); break;
            }
        }while(true);
    }

    private static Map<String,String> deleteMenuList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴 코드를 입력해주세요");
        String menuCode = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        map.put("menuCode",menuCode);
        return map;
    }

    private static Map<String,String> updateMenuList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 코드를 입력해주세요.");
        String menuCode = sc.nextLine();
        System.out.println("수정할 이름을 입력해주세요.");
        String menuName = sc.nextLine();
        System.out.println("수정할 가격을 입력해주세요.");
        String menuPrice = sc.nextLine();
        System.out.println("수정할 카테고리 코드를 입력해주세요.");
        String categoryCode = sc.nextLine();

        Map<String,String> map = new HashMap<>();
        map.put("menuCode",menuCode);
        map.put("menuName",menuName);
        map.put("menuPrice",menuPrice);
        map.put("categoryCode",categoryCode);

        return map;

    }

    private static Map<String,String> insertMenuList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 이름을 입력해주세요.");
        String menuName = sc.nextLine();
        System.out.println("메뉴 가격을 입력해주세요.");
        String menuPrice = sc.nextLine();
        System.out.println("카테고리 코드를 입력해주세요.");
        String categoryCode = sc.nextLine();

        Map<String,String> map=new HashMap<>();
        map.put("menuName",menuName);
        map.put("menuPrice",menuPrice);
        map.put("categoryCode",categoryCode);
        return map;
    }

    private static Map<String,String> insertMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 코드를 입력해주세요");
        String menuCode = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        map.put("menuCode",menuCode);
        return map;
    }
}
