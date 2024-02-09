package com.hospital.management.department.model.dto;

import com.hospital.management.doctor.model.dto.DoctorDTO;

import java.util.List;

public class DepartmentDoctorDTO {
    private int departmentCode;
    private String departmentName;
    private List<DoctorDTO> doctorList;

    public DepartmentDoctorDTO() {
    }

    public DepartmentDoctorDTO(int departmentCode, String departmentName, List<DoctorDTO> doctorList) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.doctorList = doctorList;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<DoctorDTO> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<DoctorDTO> doctorList) {
        this.doctorList = doctorList;
    }

    @Override
    public String toString() {
        return "DepartmentDoctorDTO{" +
                "departmentCode=" + departmentCode +
                ", departmentName='" + departmentName + '\'' +
                ", doctorList=" + doctorList +
                '}';
    }
}
