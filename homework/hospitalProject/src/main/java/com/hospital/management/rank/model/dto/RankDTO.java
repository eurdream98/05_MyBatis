package com.hospital.management.rank.model.dto;

public class RankDTO {
   private String rankCode;
   private String rankName;

    public RankDTO() {
    }

    public RankDTO(String rankCode, String rankName) {
        this.rankCode = rankCode;
        this.rankName = rankName;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    @Override
    public String toString() {
        return "RankDTO{" +
                "rankCode='" + rankCode + '\'' +
                ", rankName='" + rankName + '\'' +
                '}';
    }
}
