package com.ohgiraffers.dto;

import java.util.List;

public class MenuController {
    private MenuService menuService=new MenuService();
    private ResultView resultView = new ResultView();
    public void cacheTest() {
          menuService.cacheTest();
    }

    public void selectResultMapTest() {
        menuService.selectResultMapTest();
    }

    public void selectResultMapConstructorTest() {
        menuService.selectResultMapConstructorTest();
    }

    public void selectResultMapAssociatationTest() {
        menuService.selectResultMapAssociationTest();
    }

    public void selectResultMapCollectionTest() {
        menuService.selectResultMapCollectionTest();
    }

    public void sqlTest() {
        menuService.sqlTest();
    }

    public void insertTest(MenuAndCategoryDTO menuAndCategoryDTO) {
        menuService.insertTest(menuAndCategoryDTO);
    }
}
