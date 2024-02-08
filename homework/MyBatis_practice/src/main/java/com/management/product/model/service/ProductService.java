package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSession;

public class ProductService {
    private static ProductDAO productDAO;
    public List<ProductDTO> selectAllProductList() {
        SqlSession sqlSession = getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectAllProductList();
        sqlSession.close();
        return productList;

    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        // 3. 조건에 따른 제품 목록을 조회하는 로직을 작성하세요.
        // 　　아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        SqlSession sqlSession = getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectProductByCondition(searchCondition);
        sqlSession.close();
        return productList;

    }

    public boolean registNewProduct(ProductDTO product) {
        SqlSession sqlSession = getSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.registProduct(product);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;

    }

    public boolean modifyProductInfo(ProductDTO product) {
        SqlSession sqlSession = getSession();
        productDAO= sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.modifyProductInfo(product);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result>0;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        SqlSession sqlSession = getSession();
        productDAO=sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.deleteProduct(parameter);
        if(result>0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }
        return result>0;

    }
}
