package com.hospital.management.doctor.view;

import com.hospital.management.doctor.controller.DoctorController;
import com.hospital.management.patient.controller.PatientController;

import java.util.Scanner;

public class DoctorPrint {
    private static DoctorController doctorController = new DoctorController();
    public void displayMenu() {
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("===== 의사 데이터 관리 =====");
                System.out.println("0. 이전 메뉴로");
                System.out.println("1. 의사 정보 전체 조회");

                int no = sc.nextInt();
                switch (no) {
                    case 0:
                        System.out.println("이전 메뉴로 돌아갑니다.");return;
                    case 1:
                        doctorController.selectAllDoctor();break;

                    default:
                        System.out.println("번호를 잘못 입력하셨습니다.");break;
                }


            }while(true);

        }

}
