package com.hospital.management.medicalhistory.model.dao;

import com.hospital.management.medicalhistory.model.dto.MedicalHistoryDTO;
import com.hospital.management.medicalhistory.model.dto.MedicalHistoryPatientDTO;

import java.util.List;

public interface MedicalHistoryMapper {
//    List<MedicalHistoryDTO> selectAllDoctor();
//
//    MedicalHistoryDTO selectDoctorDoctorCode(int doctorCode);
//
//    int insertDoctor(MedicalHistoryDTO doctorDTO);
//
//    int updateDoctor(MedicalHistoryDTO doctorDTO);
//
//    int deleteDoctor(int doctorCode);

    List<MedicalHistoryDTO> selectAllMedicalHistory();

    MedicalHistoryDTO selectMedicalHistoryMedicalHistoryCode(int medicalHistoryCode);

    int insertMedicalHistory(MedicalHistoryDTO medicalHistoryDTO);

    int updateMedicalHistory(MedicalHistoryDTO medicalHistoryDTO);

    int deleteMedicalHistory(int medicalHistoryCode);

    List<MedicalHistoryPatientDTO> selectPatientIsNotPay();
}
