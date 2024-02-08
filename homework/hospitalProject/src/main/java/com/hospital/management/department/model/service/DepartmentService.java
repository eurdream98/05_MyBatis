package com.hospital.management.department.model.service;

import com.hospital.management.department.model.dao.DepartmentMapper;
import com.hospital.management.department.model.dto.DepartmentDTO;
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
}
