package com.hospital.management.doctor.view.view;

import com.hospital.management.doctor.view.model.dto.DoctorDTO;

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

        }
        System.out.println(errorMessage);
    }

    public void successSelectDoctorDoctorCode(DoctorDTO doctor) {
        System.out.println("===== Success =====");
        System.out.println(doctor);
    }
}
