package com.ohgiraffers.section01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    private static MenuController menuController = new MenuController();
    public static void main(String[] args) {


        do{
            System.out.println("==== 전체 메뉴 ====");
            System.out.println("1. 가격에 비슷한 메뉴 추천");
            System.out.println("2. 메뉴 카테고리 혹은 메뉴명에 따른 메뉴 검색");

            Scanner sc = new Scanner(System.in);

            int no = sc.nextInt();
            switch (no){
                case 1:menuController.selectMenuMenuPrice(insertMenuPrice());
                    break;
                case 2: menuController.selectMenuCriteria(insertCriteria());
                default: break;
            }
        }while(true);

    }

    private static Criteria insertCriteria() {
        Scanner sc = new Scanner(System.in);

        System.out.println("검색 기준을 입력해주세요.");
        String condition = sc.nextLine();
        System.out.println("검색어를 입력해주새요.");
        String value = sc.nextLine();

        return new Criteria(condition,value);
    }

    private static Map<String,Integer> insertMenuPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사용 금액을 입력해주세요.");
        Integer menuPrice = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        map.put("menuPrice",menuPrice);
        return map;
    }
}
