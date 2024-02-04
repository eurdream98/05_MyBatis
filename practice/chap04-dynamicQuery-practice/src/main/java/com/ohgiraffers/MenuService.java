package com.ohgiraffers;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.Template.getSqlSession;

public class MenuService {

    Mapper mapper;
    public List<MenuDTO> selectSuitMenu(Map<String,String> map) {
        SqlSession sqlSession = getSqlSession();
        mapper=sqlSession.getMapper(Mapper.class);
        List<MenuDTO> menuList = mapper.selectSuitMenu(map);
        return menuList;
    }
}
