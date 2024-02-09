package com.hospital.management.department.model.service;

import com.hospital.management.department.model.dao.DepartmentMapper;
import com.hospital.management.department.model.dto.DepartmentDTO;
import com.hospital.management.department.model.dto.DepartmentDoctorDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hospital.common.Template.getSqlSession;

public class DepartmentService {
    DepartmentMapper departmentMapper;
    SqlSession sqlSession;
    public List<DepartmentDTO> selectAllDepartment() {
        sqlSession = getSqlSession();
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        List<DepartmentDTO> departementList = departmentMapper.selectAllDepartment();
        sqlSession.close();
        return departementList;
    }
    public DepartmentDTO selectDepartmentDepartmentCode(int departmentCode) {
        sqlSession = getSqlSession();
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        DepartmentDTO departmentDTO = departmentMapper.selectDepartmentDepartmentCode(departmentCode);
        sqlSession.close();
        return departmentDTO;
    }

    public List<DepartmentDoctorDTO> selectDepartmentDoctor() {
        sqlSession = getSqlSession();
        departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
        List<DepartmentDoctorDTO> list = departmentMapper.selectDepartmentDoctor();
        sqlSession.close();
        return list;
    }
}
