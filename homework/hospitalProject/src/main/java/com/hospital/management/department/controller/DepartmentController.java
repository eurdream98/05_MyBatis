package com.hospital.management.department.controller;

import com.hospital.management.department.model.dto.DepartmentDTO;
import com.hospital.management.department.model.dto.DepartmentDoctorDTO;
import com.hospital.management.department.model.service.DepartmentService;
import com.hospital.management.rank.model.dto.RankDTO;
import com.hospital.management.rank.model.service.RankService;
import com.hospital.management.department.view.ResultPrint;

import java.util.List;

public class DepartmentController {
    private static DepartmentService departmentService = new DepartmentService();
    private static ResultPrint resultPrint = new ResultPrint();

    public static void selectAllDepartment() {
        List<DepartmentDTO> departmentList =  departmentService.selectAllDepartment();
        if(departmentList!=null && !departmentList.isEmpty()){
            resultPrint.successSelectAllDepartment(departmentList);
        }else{
            resultPrint.errorMessage("selectAll");
        }
    }

    public static void selectDepartmentDepartmentCode(int departmentCode) {
        DepartmentDTO departmentDTO = departmentService.selectDepartmentDepartmentCode(departmentCode);
        if(departmentDTO!=null){
            resultPrint.successSelectDepartmentDepartmentCode(departmentDTO);
        }else{
            resultPrint.errorMessage("selectOne");
        }
    }

    public void selectDepartmentDoctor() {
        List<DepartmentDoctorDTO> list = departmentService.selectDepartmentDoctor();
        if(list!=null && !list.isEmpty()){
            resultPrint.successSelectDoctor(list);
        }else{
            resultPrint.errorMessage("selectDoctor");
        }
    }
}
