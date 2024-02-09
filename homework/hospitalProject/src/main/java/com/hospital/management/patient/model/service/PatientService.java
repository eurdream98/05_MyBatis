package com.hospital.management.patient.model.service;

import com.hospital.common.SelectCriteria;
import com.hospital.management.patient.model.dao.PatientMapper;
import com.hospital.management.patient.model.dto.PatientDTO;
import com.hospital.management.patient.model.dto.PatientDepartmentDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.hospital.common.Template.getSqlSession;

public class PatientService {
    PatientMapper patientMapper;
    SqlSession sqlSession;
    public List<PatientDTO> selectAllPatient() {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDTO> patientList = patientMapper.selectAllPatient();
        sqlSession.close();
        return patientList;
    }

    public PatientDTO selectPatientPatientCode(int patientCode) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        PatientDTO patient = patientMapper.selectPatientPatientCode(patientCode);
        sqlSession.close();
        return patient;
    }

    public List<PatientDTO> selectPatientPatientGender(Map<String, String> map) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDTO> patientList = patientMapper.selectPatientPatientGender(map);
        sqlSession.close();
        return patientList;
    }

    public List<PatientDTO> selectPatientPatientDepartment(String departmentName) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDTO> patientList = patientMapper.selectPatientPatientDepartment(departmentName);
        sqlSession.close();
        return patientList;
    }

    public List<PatientDTO> selectPatientPatientAdmission(String patientAdmission) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDTO> patientList = patientMapper.selectPatientPatientAdmission(patientAdmission);
        sqlSession.close();
        return patientList;
    }

    public void insertPatient(PatientDTO patient) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        int result = patientMapper.insertPatient(patient);
        if(result>0){
            sqlSession.commit();
            System.out.println("환자 등록에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("환자 등록에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public void updatePatient(PatientDTO patient) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        int result = patientMapper.updatePatient(patient);
        if(result>0){
            sqlSession.commit();
            System.out.println("환자 수정에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("환자 수정에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public void deletePatient(int patientCode) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        int result = patientMapper.deletePatient(patientCode);
        if(result>0){
            sqlSession.commit();
            System.out.println("환자 정보 삭제에 성공하였습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("환자 정보 삭제에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public List<PatientDTO> selectByAge(int selectedAge) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDTO> patientList = patientMapper.selectByAge(selectedAge);
        sqlSession.close();
        return patientList;
    }

    public List<PatientDTO> selectByCriteria(SelectCriteria selectCriteria) {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDTO> patientList = patientMapper.selectByCriteria(selectCriteria);
        sqlSession.close();
        return patientList;
    }

    public List<PatientDepartmentDTO> selectPatientDepartment() {
        sqlSession = getSqlSession();
        patientMapper = sqlSession.getMapper(PatientMapper.class);
        List<PatientDepartmentDTO> patientList = patientMapper.selectPatientDepartment();
        sqlSession.close();
        return patientList;
    }
}
