package com.hospital.management.medicalhistory.model.dto;

import java.util.Date;

public class MedicalHistoryDTO {
    private int medicalHistoryCode;
    private String medicalHistoryDetail;
    private int medicalHistoryPrice;
    private String medicalHistoryIsPay;
    private String medicalHistoryDateTime;
    private int medicalHistoryRunTime;
    private int patientCode;
    private int doctorCode;

    public MedicalHistoryDTO() {
    }

    public MedicalHistoryDTO(int medicalHistoryCode, String medicalHistoryDetail, int medicalHistoryPrice, String medicalHistoryIsPay, String medicalHistoryDateTime, int medicalHistoryRunTime, int patientCode, int doctorCode) {
        this.medicalHistoryCode = medicalHistoryCode;
        this.medicalHistoryDetail = medicalHistoryDetail;
        this.medicalHistoryPrice = medicalHistoryPrice;
        this.medicalHistoryIsPay = medicalHistoryIsPay;
        this.medicalHistoryDateTime = medicalHistoryDateTime;
        this.medicalHistoryRunTime = medicalHistoryRunTime;
        this.patientCode = patientCode;
        this.doctorCode = doctorCode;
    }

    public MedicalHistoryDTO(String medicalHistoryDetail, int medicalHistoryPrice, String medicalHistoryIsPay, String medicalHistoryDateTime, int medicalHistoryRunTime, int patientCode, int doctorCode) {
        this.medicalHistoryDetail = medicalHistoryDetail;
        this.medicalHistoryPrice = medicalHistoryPrice;
        this.medicalHistoryIsPay = medicalHistoryIsPay;
        this.medicalHistoryDateTime = medicalHistoryDateTime;
        this.medicalHistoryRunTime = medicalHistoryRunTime;
        this.patientCode = patientCode;
        this.doctorCode = doctorCode;
    }

    public int getMedicalHistoryCode() {
        return medicalHistoryCode;
    }

    public void setMedicalHistoryCode(int medicalHistoryCode) {
        this.medicalHistoryCode = medicalHistoryCode;
    }

    public String getMedicalHistoryDetail() {
        return medicalHistoryDetail;
    }

    public void setMedicalHistoryDetail(String medicalHistoryDetail) {
        this.medicalHistoryDetail = medicalHistoryDetail;
    }

    public int getMedicalHistoryPrice() {
        return medicalHistoryPrice;
    }

    public void setMedicalHistoryPrice(int medicalHistoryPrice) {
        this.medicalHistoryPrice = medicalHistoryPrice;
    }

    public String getMedicalHistoryIsPay() {
        return medicalHistoryIsPay;
    }

    public void setMedicalHistoryIsPay(String medicalHistoryIsPay) {
        this.medicalHistoryIsPay = medicalHistoryIsPay;
    }

    public String getMedicalHistoryDateTime() {
        return medicalHistoryDateTime;
    }

    public void setMedicalHistoryDateTime(String medicalHistoryDateTime) {
        this.medicalHistoryDateTime = medicalHistoryDateTime;
    }

    public int getMedicalHistoryRunTime() {
        return medicalHistoryRunTime;
    }

    public void setMedicalHistoryRunTime(int medicalHistoryRunTime) {
        this.medicalHistoryRunTime = medicalHistoryRunTime;
    }

    public int getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(int patientCode) {
        this.patientCode = patientCode;
    }

    public int getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(int doctorCode) {
        this.doctorCode = doctorCode;
    }

    @Override
    public String toString() {
        return "MedicalHistoryDTO{" +
                "medicalHistoryCode=" + medicalHistoryCode +
                ", medicalHistoryDetail='" + medicalHistoryDetail + '\'' +
                ", medicalHistoryPrice=" + medicalHistoryPrice +
                ", medicalHistoryIsPay='" + medicalHistoryIsPay + '\'' +
                ", medicalHistoryDateTime='" + medicalHistoryDateTime + '\'' +
                ", medicalHistoryRunTime=" + medicalHistoryRunTime +
                ", patientCode=" + patientCode +
                ", doctorCode=" + doctorCode +
                '}';
    }
}
