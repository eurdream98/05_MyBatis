package com.hospital.management.doctor.view;

import com.hospital.management.doctor.controller.DoctorController;
import com.hospital.management.doctor.model.dto.DoctorDTO;
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
                System.out.println("2. 의사 번호로 정보 조회");
                System.out.println("3. 의사 정보 추가");
                System.out.println("4. 의사 정보 수정");
                System.out.println("5. 의사 정보 삭제");
                System.out.println("6. 당직 뽑기(무작위로 의사 5명 뽑아 정보 출력)");
                int no = sc.nextInt();
                switch (no) {
                    case 0:
                        System.out.println("이전 메뉴로 돌아갑니다.");return;
                    case 1:
                        doctorController.selectAllDoctor();break;
                    case 2:
                        doctorController.selectDoctorDoctorCode(insertDoctorCode());break;
                    case 3:
                        doctorController.insertDoctor(insertDoctorDTO());break;
                    case 4:
                        doctorController.updateDoctor(insertDoctorDTO2());break;
                    case 5:
                        doctorController.deleteDoctor(insertDoctorCode());break;
                    case 6:
                        doctorController.randomDoctor();break;
                    default:
                        System.out.println("번호를 잘못 입력하셨습니다.");break;
                }
            }while(true);
        }

    private DoctorDTO insertDoctorDTO2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("의사 코드를 작성해주세요");
        int doctorCode = sc.nextInt();
        System.out.print("의사 이름을 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
        sc.nextLine();
        String doctorName = sc.nextLine();
        System.out.print("의사 성별을 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
        String doctorGender = sc.nextLine();
        System.out.print("의사 휴대폰번호를 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
        String doctorPhone = sc.nextLine();
        System.out.print("의사 이메일을 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
        String doctorEmail = sc.nextLine();
        System.out.print("의사 직급 번호를 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
        int rankCode = sc.nextInt();
        System.out.print("의사 진단 부서 번호를 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
        int departmentCode = sc.nextInt();

        return  new DoctorDTO(doctorCode,doctorName,doctorGender,doctorPhone,doctorEmail,rankCode,departmentCode);
    }

    private DoctorDTO insertDoctorDTO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("의사 이름을 작성하여주세요 : ");
        String doctorName = sc.nextLine();
        System.out.print("의사 성별을 작성하여주세요 : ");
        String doctorGender = sc.nextLine();
        System.out.print("의사 휴대폰번호를 작성하여주세요 : ");
        String doctorPhone = sc.nextLine();
        System.out.print("의사 이메일을 작성하여주세요 : ");
        String doctorEmail = sc.nextLine();
        System.out.print("의사 직급 번호를 작성하여주세요 : ");
        int rankCode = sc.nextInt();
        System.out.print("의사 진단 부서 번호를 작성하여주세요 : ");
        int departmentCode = sc.nextInt();

        return new DoctorDTO(doctorName,doctorGender,doctorPhone,doctorEmail,rankCode,departmentCode);
    }

    private int insertDoctorCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("의사 번호를 입력해주세요 : ");
        int doctorCode = sc.nextInt();
        return doctorCode;
    }

}
