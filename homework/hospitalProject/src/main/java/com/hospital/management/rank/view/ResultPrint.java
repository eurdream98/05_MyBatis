package com.hospital.management.rank.view;

import com.hospital.management.department.model.dto.DepartmentDTO;
import com.hospital.management.rank.model.dto.RankDTO;
import com.hospital.management.rank.model.dto.RankDoctorDTO;

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
            case "selectRankDoctor":
                errorMessage="직급 별 의사 조회에 실패하였습니다.";

        }
        System.out.println(errorMessage);
    }

    public void successSelectAllRank(List<RankDTO> rankList) {
        System.out.println("===== Success =====");
        for(RankDTO rank : rankList){
            System.out.println(rank);
        }
    }
    public void successSelectAllRank2(List<RankDoctorDTO> rankList) {
        System.out.println("===== Success =====");
        for(RankDoctorDTO rankDoctor : rankList){
            System.out.println(rankDoctor);
        }
    }

    public void successSelectRankRankCode(RankDTO rank) {
        System.out.println("===== Success =====");
        System.out.println(rank);
    }
}
