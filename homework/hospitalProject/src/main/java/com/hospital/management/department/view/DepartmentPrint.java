package com.hospital.management.department.view;

import com.hospital.management.department.controller.DepartmentController;
import com.hospital.management.rank.controller.RankController;

import java.util.Scanner;

public class DepartmentPrint {
    private static DepartmentController  DepartmentController = new  DepartmentController();
    public void displayMenu() {
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("===== 진료과 데이터 관리 =====");
                System.out.println("0. 이전 메뉴로");
                System.out.println("1. 진료과 정보 전체 조회");
                System.out.println("2. 진료과 번호에 따른 진료과명 출력");
                System.out.println("3. 진료과별 의사 목록 조회");
                int no = sc.nextInt();
                switch (no) {
                    case 0:
                        System.out.println("이전 메뉴로 돌아갑니다.");return;
                    case 1:
                        DepartmentController.selectAllDepartment();break;
                    case 2:
                        DepartmentController.selectDepartmentDepartmentCode(insertDepartmentCode());break;
                    case 3:
                        DepartmentController.selectDepartmentDoctor();break;
                    default:
                        System.out.println("번호를 잘못 입력하셨습니다.");break;
                }
            }while(true);

        }

    private int insertDepartmentCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("진료과 번호를 입력해주세요 : ");
        int departmentCode = sc.nextInt();
        return departmentCode;
    }

}
