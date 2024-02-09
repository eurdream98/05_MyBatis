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


    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectDoctor":
                errorMessage="의사 조회에 실패하였습니다.";
                break;
            case "randomDoctor":
                errorMessage="당직 뽑기에 실패하였습니다.";
                break;

        }
        System.out.println(errorMessage);
    }

    public void successSelectDoctorDoctorCode(DoctorDTO doctor) {
        System.out.println("===== Success =====");
        System.out.println(doctor);
    }
}
