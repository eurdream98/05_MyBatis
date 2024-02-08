package com.hospital.management.department.view;

import com.hospital.management.department.model.dto.DepartmentDTO;
import com.hospital.management.rank.model.dto.RankDTO;

import java.util.List;

public class ResultPrint {

    public void errorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selectAll":
                errorMessage="진료과 전체 조회에 실패하였습니다.";
                break;
            case "selectOne":
                errorMessage="진료과 조회에 실패하였습니다.";
                break;

        }
        System.out.println(errorMessage);
    }
    public void successSelectAllDepartment(List<DepartmentDTO> departmentList) {
        System.out.println("===== Success =====");
        for(DepartmentDTO departmentDTO : departmentList){
            System.out.println(departmentDTO);
        }
    }

    public void successSelectDepartmentDepartmentCode(DepartmentDTO departmentDTO) {
        System.out.println("===== Success =====");
        System.out.println(departmentDTO);
    }


}
