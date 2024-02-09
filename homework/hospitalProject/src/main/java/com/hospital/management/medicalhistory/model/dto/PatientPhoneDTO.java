package com.hospital.management.medicalhistory.model.dto;

public class PatientPhoneDTO {
    private String patientPhone;

    public PatientPhoneDTO() {
    }

    public PatientPhoneDTO(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    @Override
    public String toString() {
        return "PatientPhoneDTO{" +
                "patientPhone='" + patientPhone + '\'' +
                '}';
    }
}
