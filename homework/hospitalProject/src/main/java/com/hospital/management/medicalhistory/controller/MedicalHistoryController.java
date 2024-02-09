package com.hospital.management.medicalhistory.controller;

import com.hospital.management.medicalhistory.model.dto.MedicalHistoryDTO;
import com.hospital.management.medicalhistory.model.dto.MedicalHistoryPatientDTO;
import com.hospital.management.medicalhistory.model.service.MedicalHistoryService;
import com.hospital.management.medicalhistory.view.ResultPrint;

import java.util.List;

public class MedicalHistoryController {
    private MedicalHistoryService medicalHistoryService = new MedicalHistoryService();
    private ResultPrint resultPrint = new ResultPrint();

    public void selectAllMedicalHistory() {
        List<MedicalHistoryDTO> medicalHistoryList = medicalHistoryService.selectAllMedicalHistory();
        if(medicalHistoryList!=null && !medicalHistoryList.isEmpty()){
            resultPrint.successSelectAllMedicalHistory(medicalHistoryList);
        }else{
            resultPrint.errorMessage("selectAll");
        }
    }

    public void selectMedicalHistoryMedicalHistoryCode(int medicalHistoryCode) {
        MedicalHistoryDTO medicalHistory = medicalHistoryService.selectMedicalHistoryMedicalHistoryCode(medicalHistoryCode);
        if(medicalHistory!=null){
            resultPrint.successSelectMedicalHistoryMedicalHistoryCode(medicalHistory);
        }else{
            resultPrint.errorMessage("selectOne");
        }
    }

    public void insertMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) {
        medicalHistoryService.insertMedicalHistory(medicalHistoryDTO);
    }


    public void updateMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) {
        medicalHistoryService.updateMedicalHistory(medicalHistoryDTO);
    }

    public void deleteMedicalHistory(int medicalHistoryCode) {
        medicalHistoryService.deleteMedicalHistory(medicalHistoryCode);
    }

    public void selectPatientIsNotPay() {
        List<MedicalHistoryPatientDTO> medicalHistoryList = medicalHistoryService.selectPatientIsNotPay();
        if(medicalHistoryList!=null && !medicalHistoryList.isEmpty()){
            resultPrint.successSelectAllMedicalHistory2(medicalHistoryList);
        }else{
            resultPrint.errorMessage("selectPatientIsNotPay");
        }
    }
}
