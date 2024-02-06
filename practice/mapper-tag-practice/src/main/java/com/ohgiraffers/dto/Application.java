package com.ohgiraffers.dto;

import java.util.Scanner;

public class Application {
    private static MenuController menuController=new MenuController();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 전체 메뉴 =====");
        System.out.println("1. cache 테스트");
        System.out.println("2. resultMap 테스트");
        System.out.println("3. sql 테스트");
        System.out.println("4. insert 테스트");
        System.out.println("=====================");
        int no = sc.nextInt();
        switch (no){
            case 1: menuController.cacheTest();break;
            case 2: resultMapServe();break;
            case 3: menuController.sqlTest();break;
            case 4: menuController.insertTest(input());break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }

    private static MenuAndCategoryDTO input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("신규 카테고리명 : ");
        String categoryName = sc.nextLine();

        System.out.println("신규 메뉴명 : ");
        String name = sc.nextLine();

        System.out.println("신규 메뉴 가격 : ");
        int menuPrice = sc.nextInt();
        System.out.println("판매 등록 여부(N/Y)");
        sc.nextLine();
        String orderableStatus = sc.nextLine();

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryName(categoryName);

        MenuAndCategoryDTO menuAndCategoryDTO = new MenuAndCategoryDTO();
        menuAndCategoryDTO.setMenuName(name);
        menuAndCategoryDTO.setMenuPrice(menuPrice);
        menuAndCategoryDTO.setOrderableStatus(orderableStatus);
        menuAndCategoryDTO.setCategory(categoryDTO);
        return menuAndCategoryDTO;
    }

    private static void resultMapServe() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("===== <resultMap> 서브 메뉴 =====");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <constructor> 테스트");
            System.out.println("3. <association> 테스트");
            System.out.println("4. <collection> 테스트");
            System.out.print("메뉴 번호를 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : menuController.selectResultMapTest(); break;
                case 2 :  menuController.selectResultMapConstructorTest();break;
                case 3 : menuController.selectResultMapAssociatationTest(); break;
                case 4 : menuController.selectResultMapCollectionTest();break;
            }

        }while(true);
    }
}
