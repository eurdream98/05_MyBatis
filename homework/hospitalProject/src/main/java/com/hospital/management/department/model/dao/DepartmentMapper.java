package com.hospital.management.department.model.dao;

import com.hospital.management.department.model.dto.DepartmentDTO;
import com.hospital.management.department.model.dto.DepartmentDoctorDTO;

import java.util.List;

public interface DepartmentMapper {
    List<DepartmentDTO> selectAllDepartment();

    DepartmentDTO selectDepartmentDepartmentCode(int departmentCode);

    List<DepartmentDoctorDTO> selectDepartmentDoctor();
}
