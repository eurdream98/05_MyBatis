package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementService elementService = new ElementService();
        do{
            System.out.println("===== Mapper Element 테스트 메뉴 =====");
            System.out.println("1. <cache> 테스트");
            System.out.println("2. <resultMap> 테스트");
            System.out.println("3. <sql> 테스트");
            System.out.println("4. <insert> 테스트");
            System.out.print("메뉴 번호를 입력 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : elementService.selectCacheTest(); break;
                case 2 : resultMapSubMenu(); break;
                case 3 : elementService.selectSqlTest();break;
                case 4 : elementService.insertCategoryAndMenuTest(inputMenuAndCategory()); break;
            }

        }while(true);
    }

    private static MenuAndCategoryDTO inputMenuAndCategory() {
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

    private static void resultMapSubMenu() {
        ElementService elementService = new ElementService();
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
                case 1 : elementService.selectResultMapTest(); break;
                case 2 :  elementService.selectResultMapConstructorTest();break;
                case 3 : elementService.selectResultMapAssociatationTest(); break;
                case 4 : elementService.selectResultMapCollectionTest();break;
            }

        }while(true);
    }
}
