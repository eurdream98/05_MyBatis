package com.hospital.management.rank.model.dao;

import com.hospital.management.rank.model.dto.RankDTO;

import java.util.List;

public interface RankMapper {

    List<RankDTO> selectAllRank();

    RankDTO selectRankRankCode(int rankCode);
}
