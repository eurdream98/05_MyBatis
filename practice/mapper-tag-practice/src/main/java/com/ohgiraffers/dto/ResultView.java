package com.ohgiraffers.dto;

import java.util.List;

public class ResultView {
    public void successCacheTest() {
        System.out.println("===== Success =====");

    }

    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "cacheTest":
                errorMessage="cache 테스팅에 성공하였습니다.";break;

        }
        System.out.println(errorMessage);
    }
}
