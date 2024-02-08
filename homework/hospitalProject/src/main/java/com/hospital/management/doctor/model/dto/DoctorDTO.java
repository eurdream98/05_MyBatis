package com.hospital.management.doctor.model.dto;

public class DoctorDTO {
    private int doctorCode;
    private String doctorName;
    private String doctorGender;
    private String doctorPhone;
    private String doctorEmail;
    private int rankCode;
    private int departmentCode;

    public DoctorDTO() {
    }

    public DoctorDTO(int doctorCode, String doctorName, String doctorGender, String doctorPhone, String doctorEmail, int rankCode, int departmentCode) {
        this.doctorCode = doctorCode;
        this.doctorName = doctorName;
        this.doctorGender = doctorGender;
        this.doctorPhone = doctorPhone;
        this.doctorEmail = doctorEmail;
        this.rankCode = rankCode;
        this.departmentCode = departmentCode;
    }

    public DoctorDTO(String doctorName, String doctorGender, String doctorPhone, String doctorEmail, int rankCode, int departmentCode) {
        this.doctorName = doctorName;
        this.doctorGender = doctorGender;
        this.doctorPhone = doctorPhone;
        this.doctorEmail = doctorEmail;
        this.rankCode = rankCode;
        this.departmentCode = departmentCode;
    }
    public int getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(int doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(String doctorGender) {
        this.doctorGender = doctorGender;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public int getRankCode() {
        return rankCode;
    }

    public void setRankCode(int rankCode) {
        this.rankCode = rankCode;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "doctorCode=" + doctorCode +
                ", doctorName='" + doctorName + '\'' +
                ", doctorGender='" + doctorGender + '\'' +
                ", doctorPhone='" + doctorPhone + '\'' +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", rankCode=" + rankCode +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
