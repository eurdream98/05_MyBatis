package com.hospital.management.doctor.model.dao;

import com.hospital.management.doctor.model.dto.DoctorDTO;

import java.util.List;

public interface DoctorMapper {
    List<DoctorDTO> selectAllDoctor();
}
