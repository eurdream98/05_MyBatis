package com.ohgiraffers.dto;

import com.ohgiraffers.dao.MenuMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {
    MenuMapper mapper;
    public void cacheTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        for(int i = 0 ; i<10 ;i++) {
            long start = System.currentTimeMillis();
            List<String> menuList = mapper.cacheTest();
            System.out.println(menuList);
            long end = System.currentTimeMillis();
            System.out.print("소요 시간 : " + (end - start));
            System.out.println();
        }
        sqlSession.close();
    }

    public void selectResultMapTest() {
        SqlSession sqlSession = getSqlSession();
        mapper= sqlSession.getMapper(MenuMapper.class);
        List<MenuDTO> menuList = mapper.selectResultMapTest();
        if(menuList!=null && !menuList.isEmpty()){
            System.out.println("===== Success =====");
            for(MenuDTO menu : menuList){
                System.out.println(menu);
            }
        }
        sqlSession.close();
    }

    public void selectResultMapConstructorTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();
        if(menuList!=null && !menuList.isEmpty()){
            System.out.println("===== Success =====");
            for(MenuDTO menu : menuList){
                System.out.println(menu);
            }
        }
        sqlSession.close();

    }

    public void selectResultMapAssociationTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();
        if(menuList!=null && !menuList.isEmpty()){
            System.out.println("===== Success =====");
            for(MenuAndCategoryDTO menu : menuList){
                System.out.println(menu);
            }
        }
        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);
//        SqlSession sqlSession = getSqlSession();
//         mapper = sqlSession.getMapper(MenuMapper.class);
        List<CategoryAndMenuDTO> menuList = mapper.selectResultMapCollectionTest();
        if(menuList!=null && !menuList.isEmpty()){
            System.out.println("===== Success =====");
            for(CategoryAndMenuDTO menu : menuList){
                System.out.println(menu);
            }
        }
        sqlSession.close();
    }

    public void sqlTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDTO> menuList = mapper.sqlTest();
        if(menuList!=null && !menuList.isEmpty()){
            System.out.println("===== Success =====");
            for(MenuDTO menu : menuList){
                System.out.println(menu);
            }
        }
        sqlSession.close();
    }

    public boolean insertTest(MenuAndCategoryDTO menuAndCategoryDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper=sqlSession.getMapper(MenuMapper.class);
        int result2 = mapper.insertCategoryTest(menuAndCategoryDTO);
        int result = mapper.insertTest(menuAndCategoryDTO);

        if(result>0 && result2>0){
            sqlSession.commit();
            System.out.println("메뉴 추가에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("메뉴 추가에 실패하였습니다.");
        }
        return result>0;
    }
}
