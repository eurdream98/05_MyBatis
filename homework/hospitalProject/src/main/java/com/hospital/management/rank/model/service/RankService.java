package com.hospital.management.rank.model.service;

import com.hospital.management.rank.model.dao.RankMapper;
import com.hospital.management.rank.model.dto.RankDTO;
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
}
