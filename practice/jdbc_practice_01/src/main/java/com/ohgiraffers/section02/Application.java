package com.ohgiraffers.section02;

import java.util.Scanner;

public class Application {

    static MenuController menuController = new MenuController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("==== 메뉴판 ====");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("================");

            int no = sc.nextInt();

            switch (no){
                case 1:
                        menuController.selectAllMenu();break;
                case 2:
                    menuController.selectMenuMenuCode(insertMenuCode());break;
                case 3:
                    menuController.insertMenu(insertMenuDTO());
                    break;
                case 4:
                    menuController.updateMenu(updateMenuDTO());break;
                case 5:
                    menuController.deleteMenu(insertMenuCode());break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");break;
            }
        }while(true);
    }

    private static MenuDTO updateMenuDTO() {
        MenuDTO menu = new MenuDTO();
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 메뉴 코드를 입력해주세요");
        int menuCode = sc.nextInt();
        sc.nextLine();
        System.out.println("수정할 메뉴 이름을 작성해주세요");
        String menuName = sc.nextLine();
        System.out.println("수정할 메뉴 가격을 작성해주세요");
        int menuPrice = sc.nextInt();
        sc.nextLine();
        System.out.println("수정할 카테고리 코드를 작성해주세요");
        int categoryCode = sc.nextInt();
        sc.nextLine();
        System.out.println("수정할 판매 상태를 작성해주세요");
        String orderableStatus = sc.nextLine();
        menu.setMenuCode(menuCode);
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);
        menu.setOrderableStatus(orderableStatus);
        return menu;
    }

    private static MenuDTO insertMenuDTO() {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 이름을 추가해주세요");
        String name = sc.nextLine();
        System.out.println("메뉴 가격을 입력해주세요");
        int menuPrice = sc.nextInt();
        sc.nextLine();
        System.out.println("카테고리 코드를 입력해주세요");
        int categoryCode = sc.nextInt();
        String orderableStatus = "Y";
        MenuDTO menu = new MenuDTO();
        menu.setMenuName(name);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);
        menu.setOrderableStatus(orderableStatus);
        return menu;
    }

    static public int insertMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 코드를 입력해주세요:");
        int menuCode = sc.nextInt();
        return menuCode;
    }
}
