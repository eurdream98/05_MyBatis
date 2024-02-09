package com.hospital.management.medicalhistory.model.service;

import com.hospital.management.medicalhistory.model.dao.MedicalHistoryMapper;
import com.hospital.management.medicalhistory.model.dto.MedicalHistoryDTO;
import com.hospital.management.medicalhistory.model.dto.MedicalHistoryPatientDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hospital.common.Template.getSqlSession;

public class MedicalHistoryService {
    MedicalHistoryMapper medicalHistoryMapper;
    SqlSession sqlSession;

    public List<MedicalHistoryDTO> selectAllMedicalHistory() {
        sqlSession = getSqlSession();
        medicalHistoryMapper = sqlSession.getMapper(MedicalHistoryMapper.class);
        List<MedicalHistoryDTO> medicalHistoryList= medicalHistoryMapper.selectAllMedicalHistory();
        sqlSession.close();
        return medicalHistoryList;
    }

    public MedicalHistoryDTO selectMedicalHistoryMedicalHistoryCode(int medicalHistoryCode) {
        sqlSession = getSqlSession();
        medicalHistoryMapper = sqlSession.getMapper(MedicalHistoryMapper.class);
        MedicalHistoryDTO medicalHistory = medicalHistoryMapper.selectMedicalHistoryMedicalHistoryCode(medicalHistoryCode);
        sqlSession.close();
        return medicalHistory;
    }

    public void insertMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) {
        sqlSession = getSqlSession();
        medicalHistoryMapper = sqlSession.getMapper(MedicalHistoryMapper.class);
        int result = medicalHistoryMapper.insertMedicalHistory(medicalHistoryDTO);
        if(result>0){
            sqlSession.commit();
            System.out.println("진료 내역 등록이 완료되었습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("진료 내역 등록이 실패하였습니다.");
        }
        sqlSession.close();
    }

    public void updateMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) {
        sqlSession = getSqlSession();
        medicalHistoryMapper = sqlSession.getMapper(MedicalHistoryMapper.class);
        int result = medicalHistoryMapper.updateMedicalHistory(medicalHistoryDTO);
        if(result>0){
            sqlSession.commit();
            System.out.println("진료 내역 수정이 완료되었습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("진료 내역 수정이 실패하였습니다.");
        }
        sqlSession.close();
    }

    public void deleteMedicalHistory(int medicalHistoryCode) {
        sqlSession = getSqlSession();
        medicalHistoryMapper = sqlSession.getMapper(MedicalHistoryMapper.class);
        int result = medicalHistoryMapper.deleteMedicalHistory(medicalHistoryCode);
        if(result>0){
            sqlSession.commit();
            System.out.println("진료 내역 삭제가 완료되었습니다.");
        }else{
            sqlSession.rollback();
            System.out.println("진료 내역 삭제에 실패하였습니다.");
        }
        sqlSession.close();
    }

    public List<MedicalHistoryPatientDTO> selectPatientIsNotPay() {
        sqlSession = getSqlSession();
        medicalHistoryMapper = sqlSession.getMapper(MedicalHistoryMapper.class);
        List<MedicalHistoryPatientDTO> medicalHistoryList= medicalHistoryMapper.selectPatientIsNotPay();
        sqlSession.close();
        return medicalHistoryList;
    }
}
