package com.hospital.management.rank.model.dto;

import com.hospital.management.doctor.model.dto.DoctorDTO;

import java.util.List;

public class RankDoctorDTO {
    private String rankCode;
    private String rankName;
    private List<DoctorDTO> doctorList;

    public RankDoctorDTO() {
    }

    public RankDoctorDTO(String rankCode, String rankName, List<DoctorDTO> doctorList) {
        this.rankCode = rankCode;
        this.rankName = rankName;
        this.doctorList = doctorList;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public List<DoctorDTO> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<DoctorDTO> doctorList) {
        this.doctorList = doctorList;
    }

    @Override
    public String toString() {
        return "RankDoctorDTO{" +
                "rankCode='" + rankCode + '\'' +
                ", rankName='" + rankName + '\'' +
                ", doctorList=" + doctorList +
                '}';
    }
}
