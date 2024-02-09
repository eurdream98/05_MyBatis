package com.hospital.management.patient.controller;

import com.hospital.common.SelectCriteria;
import com.hospital.management.patient.model.dto.PatientDTO;
import com.hospital.management.patient.model.dto.PatientDepartmentDTO;
import com.hospital.management.patient.model.service.PatientService;
import com.hospital.management.patient.view.ResultPrint;

import java.util.List;
import java.util.Map;

public class PatientController {
    private PatientService patientService = new PatientService();
    private ResultPrint resultPrint = new ResultPrint();
    public void selectAllPatient() {
        List<PatientDTO> patientList =  patientService.selectAllPatient();
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient(patientList);
        }else{
            resultPrint.errorMessage("selectAll");
        }
    }

    public void selectPatientPatientCode(int patientCode) {
        PatientDTO patient = patientService.selectPatientPatientCode(patientCode);
        if(patient!=null){
            resultPrint.successSelectPatientPatientCode(patient);
        }else{
            resultPrint.errorMessage("selectPatientPatientCode");
        }
    }

    public void selectPatientPatientGender(Map<String, String> map) {
        List<PatientDTO> patientList =  patientService.selectPatientPatientGender(map);
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient(patientList);
        }else{
            resultPrint.errorMessage("selectPatientPatientGender");
        }
    }

    public void selectPatientPatientDepartment(String departmentName) {
        List<PatientDTO> patientList =  patientService.selectPatientPatientDepartment(departmentName);
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient(patientList);
        }else{
            resultPrint.errorMessage("selectPatientPatientDepartment");
        }
    }

    public void selectPatientPatientAdmission(String patientAdmission) {
        List<PatientDTO> patientList =  patientService.selectPatientPatientAdmission(patientAdmission);
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient(patientList);
        }else{
            resultPrint.errorMessage("selectPatientPatientAdmission");
        }
    }

    public void insertPatient(PatientDTO patient) {
       patientService.insertPatient(patient);
    }

    public void updatePatient(PatientDTO patient) {
        patientService.updatePatient(patient);
    }

    public void deletePatient(int patientCode) {
        patientService.deletePatient(patientCode);
    }

    public void selectByAge(int selectedAge) {
        List<PatientDTO> patientList = patientService.selectByAge(selectedAge);
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient(patientList);
        }else{
            resultPrint.errorMessage("selectByAge");
        }
    }

    public void selectByCriteria(SelectCriteria selectCriteria) {
        List<PatientDTO> patientList = patientService.selectByCriteria(selectCriteria);
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient(patientList);
        }else{
            resultPrint.errorMessage("selectByCriteria");
        }
    }

    public void selectPatientDepartment() {
        List<PatientDepartmentDTO> patientList =  patientService.selectPatientDepartment();
        if(patientList!=null && !patientList.isEmpty()){
            resultPrint.successSelectAllPatient2(patientList);
        }else{
            resultPrint.errorMessage("selectPatientDepartment");
        }
    }
}
