package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> productList) {
        System.out.println("==== Success ====");
        for(ProductDTO product : productList){
            System.out.println(product);
        }

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        System.out.print("검색 조건 : "+searchCondition.getOption());
        System.out.println("검색어 : "+searchCondition.getValue());
        for(ProductDTO product : productList){
            System.out.println(product);
        }

    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
            case "insert":
                successMessage="상품 추가에 성공하였습니다.";
                break;
            case "modify":
                successMessage="상품 수정에 성공하였습니다.";
                break;
            case "delete":
                successMessage="상품 삭제에 성공하셨습니다.";
                break;

        }
        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectAll":
                errorMessage="상품 전체조회에 실패하였습니다.";
                break;
            case "selectProductByCondition":
                errorMessage="상품 조회에 실패하였습니다.";
                break;
            case "modify":
                errorMessage="상품 수정에 실패하였습니다.";
                break;
            case "delete":
                errorMessage="상품 삭제에 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);

    }

}
