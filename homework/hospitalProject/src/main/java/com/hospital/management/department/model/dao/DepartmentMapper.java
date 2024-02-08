package com.hospital.management.department.model.dao;

import com.hospital.management.department.model.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentMapper {
    List<DepartmentDTO> selectAllDepartment();

    DepartmentDTO selectDepartmentDepartmentCode(int departmentCode);
}
