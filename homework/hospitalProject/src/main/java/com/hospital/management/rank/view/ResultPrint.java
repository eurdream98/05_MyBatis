package com.hospital.management.rank.view;

import com.hospital.management.department.model.dto.DepartmentDTO;
import com.hospital.management.rank.model.dto.RankDTO;

import java.util.List;

public class ResultPrint {

    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectAll":
                errorMessage="직급 전체 조회에 실패하였습니다.";
                break;
            case "selectRank":
                errorMessage="직급 조회에 실패하였습니다.";
                break;

        }
        System.out.println(errorMessage);
    }

    public void successSelectAllRank(List<RankDTO> rankList) {
        System.out.println("===== Success =====");
        for(RankDTO rank : rankList){
            System.out.println(rank);
        }
    }

    public void successSelectRankRankCode(RankDTO rank) {
        System.out.println("===== Success =====");
        System.out.println(rank);
    }
}
