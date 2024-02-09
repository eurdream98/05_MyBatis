package com.hospital.management.doctor.model.service;

import com.hospital.management.doctor.model.dao.DoctorMapper;
import com.hospital.management.doctor.model.dto.DoctorDTO;
import com.hospital.management.patient.model.dao.PatientMapper;
import com.hospital.management.patient.model.dto.PatientDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public DoctorDTO selectDoctorDoctorCode(int doctorCode) {
        sqlSession = getSqlSession();
        doctorMapper = sqlSession.getMapper(DoctorMapper.class);
        DoctorDTO doctor = doctorMapper.selectDoctorDoctorCode(doctorCode);
        sqlSession.close();
        return doctor;
    }

    public void insertDoctor(DoctorDTO doctorDTO) {
        sqlSession = getSqlSession();
        doctorMapper = sqlSession.getMapper(DoctorMapper.class);
        int result = doctorMapper.insertDoctor(doctorDTO);
        if(result>0){
            sqlSession.commit();
            System.out.println("의사 정보 추가에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("의사 정보 추가에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public void updateDoctor(DoctorDTO doctorDTO) {
        sqlSession = getSqlSession();
        doctorMapper = sqlSession.getMapper(DoctorMapper.class);
        int result = doctorMapper.updateDoctor(doctorDTO);
        if(result>0){
            sqlSession.commit();
            System.out.println("의사 정보 수정에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("의사 정보 수정에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public void deleteDoctor(int doctorCode) {
        sqlSession = getSqlSession();
        doctorMapper = sqlSession.getMapper(DoctorMapper.class);
        int result = doctorMapper.deleteDoctor(doctorCode);
        if(result>0){
            sqlSession.commit();
            System.out.println("의사 정보 삭제에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("의사 정보 삭제에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public List<DoctorDTO> randomDoctor(Map resultMap) {
        sqlSession=getSqlSession();
        doctorMapper = sqlSession.getMapper(DoctorMapper.class);
        List<DoctorDTO> doctorList = doctorMapper.randomDoctor(resultMap);
        sqlSession.close();
        return doctorList;
    }
}
