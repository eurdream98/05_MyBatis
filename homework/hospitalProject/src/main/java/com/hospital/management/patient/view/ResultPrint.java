package com.hospital.management.patient.view;

import com.hospital.management.patient.model.dto.PatientDTO;
import com.hospital.management.patient.model.dto.PatientDepartmentDTO;

import java.util.List;

public class ResultPrint {
    public void successSelectAllPatient(List<PatientDTO> patientList) {
        System.out.println("===== Success =====");
        for(PatientDTO patient : patientList){
            System.out.println(patient);
        }
    }


    public void successSelectPatientPatientCode(PatientDTO patient) {
        System.out.println("===== Success =====");
        System.out.println(patient);
    }

    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectAll":
                errorMessage="환자 전체 조회에 실패하였습니다.";
                break;
            case "selectPatientPatientCode":
                errorMessage="환자 번호를 통한 환자 조회에 실패하였습니다.";
                break;
            case "selectPatientPatientGender":
                errorMessage="환자 성별에 따른 환자 조회에 실패하였습니다.";
                break;
            case "selectPatientPatientDepartment":
                errorMessage="환자 병과에 따른 환자 조회에 실패하였습니다.";
                break;
            case "selectPatientPatientAdmission":
                errorMessage="환자 현재 입원 여부에 따른 환자 조회에 실패하였습니다.";
                break;
            case "insertPatient":
                errorMessage="환자 등록에 성공하였습니다.";
                break;
            case "selectByAge":
                errorMessage="나이대별 환자 조회에 실패하였습니다.";
                break;
            case "selectByCriteria":
                errorMessage="조회 기준에 따른 조회에 실패하였습니다.";
                break;
            case "selectPatientDepartment":
                errorMessage="환자별 진료과 조회 실패";

        }
        System.out.println(errorMessage);
    }

    public void successSelectAllPatient2(List<PatientDepartmentDTO> patientList) {
        System.out.println("===== Success =====");
        for(PatientDepartmentDTO PatientDepartment : patientList){
            System.out.println(PatientDepartment);
        }
    }
}
