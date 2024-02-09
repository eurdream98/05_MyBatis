package com.hospital.management.rank.model.service;

import com.hospital.management.rank.model.dao.RankMapper;
import com.hospital.management.rank.model.dto.RankDTO;
import com.hospital.management.rank.model.dto.RankDoctorDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.hospital.common.Template.getSqlSession;

public class RankService {
    RankMapper rankMapper;
    SqlSession sqlSession;
    public List<RankDTO> selectAllRank() {
        sqlSession = getSqlSession();
        rankMapper = sqlSession.getMapper(RankMapper.class);
        List<RankDTO> rankList = rankMapper.selectAllRank();
        sqlSession.close();
        return rankList;
    }

    public RankDTO selectRankRankCode(int rankCode) {
        sqlSession = getSqlSession();
        rankMapper = sqlSession.getMapper(RankMapper.class);
        RankDTO rank = rankMapper.selectRankRankCode(rankCode);
        sqlSession.close();
        return rank;
    }

    public List<RankDoctorDTO> selectRankDoctor() {
        sqlSession = getSqlSession();
        rankMapper = sqlSession.getMapper(RankMapper.class);
        List<RankDoctorDTO> rankDoctorList = rankMapper.selectRankDoctor();
        sqlSession.close();
        return rankDoctorList;
    }
}
