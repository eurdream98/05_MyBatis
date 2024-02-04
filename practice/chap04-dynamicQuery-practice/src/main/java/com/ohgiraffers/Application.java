package com.ohgiraffers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("====선택====");
            System.out.println("1. if문 테스트");
            int no = sc.nextInt();
            switch (no){
                case 1: subIf();break;
                default:
                    System.out.println("번호를 잘못입력했어");break;
            }
        }while(true);
    }

    private static void subIf() {
        MenuController menuController = new MenuController();

        Scanner sc = new Scanner(System.in);
        System.out.println("==== 선택2 ====");
        System.out.println("1. 선택한 가격 근처의 메뉴들 추천");
        System.out.println("2. 메뉴 혹은 카테고리를 입력받아 기준으로 삼고 메뉴기준이면 입력한 값 들어간 음식 추천,카테고리 기준이면 입력한 값과 일치하는" +
                "카테고리 음식 출력");
        int no =sc.nextInt();

        switch (no){
            case 1:menuController.selectSuitMenu(insertMenuPrice());break;
            default:
                System.out.println("번호를 잘못 입력했어");break;
        }
    }

    private static Map<String,String> insertMenuPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("가격을 입력하세요");
        String menuPrice = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        map.put("menuPrice",menuPrice);
        return map;
    }
}
