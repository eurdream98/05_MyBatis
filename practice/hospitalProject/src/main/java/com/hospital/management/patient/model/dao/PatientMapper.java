package com.hospital.management.patient.model.dao;

import com.hospital.management.patient.model.dto.PatientDTO;

import java.util.List;
import java.util.Map;

public interface PatientMapper {
    List<PatientDTO> selectAllPatient();

    PatientDTO selectPatientPatientCode(int patientCode);

    List<PatientDTO> selectPatientPatientGender(Map<String, String> map);

    List<PatientDTO> selectPatientPatientDepartment(String departmentName);

    List<PatientDTO> selectPatientPatientAdmission(String patientAdmission);

    int insertPatient(PatientDTO patient);

    int updatePatient(PatientDTO patient);
}
