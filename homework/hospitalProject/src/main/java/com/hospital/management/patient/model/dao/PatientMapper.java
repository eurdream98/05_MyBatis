package com.hospital.management.patient.model.dao;

import com.hospital.common.SelectCriteria;
import com.hospital.management.patient.model.dto.PatientDTO;
import com.hospital.management.patient.model.dto.PatientDepartmentDTO;
import org.apache.ibatis.annotations.Param;

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

    int deletePatient(int patientCode);

    List<PatientDTO> selectByAge(@Param("selectedAge") int selectedAge);

    List<PatientDTO> selectByCriteria(SelectCriteria selectCriteria);

    List<PatientDepartmentDTO> selectPatientDepartment();
}
