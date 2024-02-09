package com.hospital.management.medicalhistory.view;

import com.hospital.management.medicalhistory.model.dto.MedicalHistoryDTO;
import com.hospital.management.medicalhistory.model.dto.MedicalHistoryPatientDTO;

import java.util.List;

public class ResultPrint {
    public void successSelectAllMedicalHistory(List<MedicalHistoryDTO> medicalHistoryList) {
        System.out.println("===== Success =====");
        for(MedicalHistoryDTO medicalHistory : medicalHistoryList){
            System.out.println(medicalHistory);
        }
    }


    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectAll":
                errorMessage="진료기록 전체 조회에 실패하였습니다.";
                break;
            case "selectOne":
                errorMessage="진료기록 조회에 실패하였습니다.";
                break;
            case "selectPatientIsNotPay":
                errorMessage="진료비 미완인 환자 조회에 실패하였습니다.";
                break;

        }
        System.out.println(errorMessage);
    }

    public void successSelectMedicalHistoryMedicalHistoryCode(MedicalHistoryDTO medicalHistory) {
        System.out.println("===== Success =====");
        System.out.println(medicalHistory);
    }

    public void successSelectAllMedicalHistory2(List<MedicalHistoryPatientDTO> medicalHistoryList) {
        System.out.println("===== Success =====");
        for(MedicalHistoryPatientDTO medicalHistory : medicalHistoryList){
            System.out.println(medicalHistory);
        }
    }
}
