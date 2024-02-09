package com.hospital.management.medicalhistory.model.dto;

public class MedicalHistoryPatientDTO {
    private int medicalHistoryCode;
    private String medicalHistoryDetail;
    private int medicalHistoryPrice;
    private String medicalHistoryIsPay;
    private String medicalHistoryDateTime;
    private int medicalHistoryRunTime;
    private PatientPhoneDTO patientPhone;
    private int doctorCode;

    public MedicalHistoryPatientDTO() {
    }

    public MedicalHistoryPatientDTO(int medicalHistoryCode, String medicalHistoryDetail, int medicalHistoryPrice, String medicalHistoryIsPay, String medicalHistoryDateTime, int medicalHistoryRunTime, PatientPhoneDTO patientPhone, int doctorCode) {
        this.medicalHistoryCode = medicalHistoryCode;
        this.medicalHistoryDetail = medicalHistoryDetail;
        this.medicalHistoryPrice = medicalHistoryPrice;
        this.medicalHistoryIsPay = medicalHistoryIsPay;
        this.medicalHistoryDateTime = medicalHistoryDateTime;
        this.medicalHistoryRunTime = medicalHistoryRunTime;
        this.patientPhone = patientPhone;
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

    public PatientPhoneDTO getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(PatientPhoneDTO patientPhone) {
        this.patientPhone = patientPhone;
    }

    public int getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(int doctorCode) {
        this.doctorCode = doctorCode;
    }

    @Override
    public String toString() {
        return "MedicalHistoryPatientDTO{" +
                "medicalHistoryCode=" + medicalHistoryCode +
                ", medicalHistoryDetail='" + medicalHistoryDetail + '\'' +
                ", medicalHistoryPrice=" + medicalHistoryPrice +
                ", medicalHistoryIsPay='" + medicalHistoryIsPay + '\'' +
                ", medicalHistoryDateTime='" + medicalHistoryDateTime + '\'' +
                ", medicalHistoryRunTime=" + medicalHistoryRunTime +
                ", patientPhone=" + patientPhone +
                ", doctorCode=" + doctorCode +
                '}';
    }
}
