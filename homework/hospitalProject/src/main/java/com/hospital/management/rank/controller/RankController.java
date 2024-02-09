package com.hospital.management.rank.controller;

import com.hospital.management.rank.model.dto.RankDTO;
import com.hospital.management.rank.model.dto.RankDoctorDTO;
import com.hospital.management.rank.model.service.RankService;
import com.hospital.management.rank.view.ResultPrint;

import java.util.List;

public class RankController {
    private static RankService rankService = new RankService();
    private static ResultPrint resultPrint = new ResultPrint();

    public static void selectAllRank() {
        List<RankDTO> rankList =  rankService.selectAllRank();
        if(rankList!=null && !rankList.isEmpty()){
            resultPrint.successSelectAllRank(rankList);
        }else{
            resultPrint.errorMessage("selectAll");
        }
    }

    public static void selectRankRankCode(int rankCode) {
        RankDTO rank = rankService.selectRankRankCode(rankCode);
        if(rank!=null){
            resultPrint.successSelectRankRankCode(rank);
        }else{
            resultPrint.errorMessage("selectRank");
        }
    }


    public static void selectRankDoctor() {
        List<RankDoctorDTO> rankDoctorList =  rankService.selectRankDoctor();
        if(rankDoctorList!=null && !rankDoctorList.isEmpty()){
            resultPrint.successSelectAllRank2(rankDoctorList);
        }else{
            resultPrint.errorMessage("selectRankDoctor");
        }
    }
}
