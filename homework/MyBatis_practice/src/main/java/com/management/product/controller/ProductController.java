package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductPrint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class ProductController {

    // * 주석을 지우고 Controller 역할에 해당하는 내용을 작성하세요.


    // 1. 자주 사용할 Service와 Print 객체를 선언하고, Controller 객체 생성 시 생성되도록 작성하세요.
    private static ProductService productService;
    private static ProductPrint productPrint;

    public ProductController(){
       productService=new ProductService();
       productPrint=new ProductPrint();
    }
    public void selectAllProductList() {
        List<ProductDTO> productList =  productService.selectAllProductList();
        if(productList!=null && !productList.isEmpty()){
            productPrint.printAllProductList(productList);
        }else{
            productPrint.printErrorMessage("selectAll");
        }

    }

    public void selectProductByCondition(SearchCondition searchCondition) {

        // 3. 조건에 따른 제품 목록을 조회하는 메소드
        //    (조건 1) Service 객체를 호출하여 List<ProductDTO> 타입으로 조건에 따른 제품 목록을 조회하세요.
        //    (조건 2) 제품 목록이 비어있지 않은 경우, SearchCondition과 List<ProductDTO> 객체를 반환하여
        //    　　　　　Print 객체를 통해 조회 조건과 제품 목록을 출력하세요.
        //    (조건 3) 제품 목록이 없는 경우, Print 객체를 통해 조회 결과가 없다는 오류 메세지를 출력하세요.
        List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);
        if(productList!=null && !productList.isEmpty())
        {
            productPrint.printProductList(productList,searchCondition);
        }else{
            productPrint.printErrorMessage("selectProductByCondition");
        }


    }

    public void registNewProduct(ProductDTO product) {

        // 4. 제품 정보를 등록하는 메소드
        //    (조건 1) 화면에서 releaseDate를 0000-00-00 형태로 받아옵니다.
        //            해당 필드에 매핑되는 DB 컬럼 releaseDate가 8byte이므로 '-' 문자를 제거하여 product객체에 setting 하세요.
        //            또한 제품 최초 등록 시 생산여부는 무조건 '생산중(Y)'이고, 판매량은 0이므로 해당 값을 product객체에 setting 하세요.
        //　  (조건 2) Service 객체를 호출하여 등록을 수행하고, 결과를 boolean 값으로 return 받으세요.
        //    (조건 3) insert가 정상적으로 수행된 경우, Print 객체를 통해 등록 성공했다는 성공 메세지를 출력하세요.
        //    (조건 4) insert가 정상적으로 수행되지 않은 경우, Print 객체를 통해 등록 실패했다는 오류 메세지를 출력하세요.
        String dateString = "2024-02-05";
        DateTimeFormatter sourceFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter targetFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

// 주어진 형식으로 날짜 파싱
        LocalDate date = LocalDate.parse(dateString, sourceFormatter);

// 원하는 형식으로 포맷팅
        String formattedDate = date.format(targetFormatter);
        System.out.println(formattedDate);
        product.setReleaseDate(formattedDate);
        product.setProductionStatus("Y");
        product.setSalesQuantity("0");
        if(productService.registNewProduct(product)){
            productPrint.printSuccessMessage("insert");
        }else{
            productPrint.printErrorMessage("insert");
        }
    }

    public void modifyProductInfo(ProductDTO product) {

        // 5. 제품 정보를 수정하는 메소드
        //    (조건 1) 화면에서 releaseDate를 0000-00-00 형태로 받아옵니다.
        //            해당 필드에 매핑되는 DB 컬럼 releaseDate가 8byte이므로 '-' 문자를 제거하여 product객체에 setting 하세요.
        //　  (조건 2) Service 객체를 호출하여 수정을 수행하고, 결과를 boolean 값으로 return 받으세요.
        //    (조건 3) update가 정상적으로 수행된 경우, Print 객체를 통해 수정 성공했다는 성공 메세지를 출력하세요.
        //    (조건 4) update가 정상적으로 수행되지 않은 경우, Print 객체를 통해 수정 실패했다는 오류 메세지를 출력하세요.
        String dateString = "2024-02-05";
        DateTimeFormatter sourceFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter targetFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

// 주어진 형식으로 날짜 파싱
        LocalDate date = LocalDate.parse(dateString, sourceFormatter);

// 원하는 형식으로 포맷팅
        String formattedDate = date.format(targetFormatter);
        System.out.println(formattedDate);
        product.setReleaseDate(formattedDate);
        if(productService.modifyProductInfo(product)){
            productPrint.printSuccessMessage("modify");
        }else{
            productPrint.printErrorMessage("modify");
        };
    }

    public void deleteProduct(Map<String, String> parameter) {

        // 6. 제품 정보를 삭제하는 메소드
        //    (조건 1) Service 객체를 호출하여 수정을 수행하고, 결과를 boolean 값으로 return 받으세요.
        //    (조건 2) delete가 정상적으로 수행된 경우, Print 객체를 통해 삭제 성공했다는 성공 메세지를 출력하세요.
        //    (조건 3) delete가 정상적으로 수행되지 않은 경우, Print 객체를 통해 삭제 실패했다는 오류 메세지를 출력하세요.
        if(productService.deleteProduct(parameter)){
            productPrint.printSuccessMessage("delete");
        }else{
            productPrint.printErrorMessage("delete");
        }
    }
}
