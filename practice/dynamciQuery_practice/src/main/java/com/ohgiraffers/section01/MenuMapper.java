package com.ohgiraffers.section01;

import java.util.List;
import java.util.Map;

public interface MenuMapper {

    List<MenuDTO> selectMenuMenuPrice(Map<String, Integer> parameter);

    List<MenuDTO> selectMenuCriteria(Criteria criteria);
}
