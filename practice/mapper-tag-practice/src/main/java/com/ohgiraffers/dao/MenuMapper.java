package com.ohgiraffers.dao;

import com.ohgiraffers.dto.CategoryAndMenuDTO;
import com.ohgiraffers.dto.MenuAndCategoryDTO;
import com.ohgiraffers.dto.MenuDTO;

import java.util.List;

public interface MenuMapper {
    List<String> cacheTest();

    List<MenuDTO> selectResultMapTest();

    List<MenuDTO> selectResultMapConstructorTest();

    List<MenuAndCategoryDTO> selectResultMapAssociationTest();

    List<CategoryAndMenuDTO> selectResultMapCollectionTest();

    List<MenuDTO> sqlTest();

    int insertTest(MenuAndCategoryDTO menuAndCategoryDTO);

    int insertCategoryTest(MenuAndCategoryDTO menuAndCategoryDTO);
}
