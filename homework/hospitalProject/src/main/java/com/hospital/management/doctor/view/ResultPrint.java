package com.hospital.management.doctor.view;

import com.hospital.management.doctor.model.dto.DoctorDTO;
import com.hospital.management.patient.model.dto.PatientDTO;

import java.util.List;

public class ResultPrint {
    public void successSelectAllDoctor(List<DoctorDTO> doctorList) {
        System.out.println("===== Success =====");
        for(DoctorDTO doctor : doctorList){
            System.out.println(doctor);
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
                errorMessage="의사 전체 조회에 실패하였습니다.";
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

        }
        System.out.println(errorMessage);
    }
}
