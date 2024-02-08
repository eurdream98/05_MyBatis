package com.hospital.management.doctor.model.service;

import com.hospital.management.doctor.model.dao.DoctorMapper;
import com.hospital.management.doctor.model.dto.DoctorDTO;
import com.hospital.management.patient.model.dao.PatientMapper;
import com.hospital.management.patient.model.dto.PatientDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hospital.common.Template.getSqlSession;

public class DoctorService {
    DoctorMapper doctorMapper;
    SqlSession sqlSession;
    public List<DoctorDTO> selectAllDoctor() {
        sqlSession = getSqlSession();
        doctorMapper = sqlSession.getMapper(DoctorMapper.class);
        List<DoctorDTO> doctorList = doctorMapper.selectAllDoctor();
        sqlSession.close();
        return doctorList;
    }

}
