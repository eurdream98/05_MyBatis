package com.hospital.management.doctor.controller;

import com.hospital.management.doctor.model.dto.DoctorDTO;
import com.hospital.management.doctor.model.service.DoctorService;
import com.hospital.management.patient.model.dto.PatientDTO;
import com.hospital.management.patient.model.service.PatientService;
import com.hospital.management.doctor.view.ResultPrint;

import java.util.List;

public class DoctorController {
    private DoctorService doctorService = new DoctorService();
    private ResultPrint resultPrint = new ResultPrint();
    public void selectAllDoctor() {
        List<DoctorDTO> doctorList =  doctorService.selectAllDoctor();
        if(doctorList!=null && !doctorList.isEmpty()){
            resultPrint.successSelectAllDoctor(doctorList);
        }else{
            resultPrint.errorMessage("selectAll");
        }
    }

}
