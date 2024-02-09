package com.hospital.management.medicalhistory.view;

import com.hospital.management.medicalhistory.controller.MedicalHistoryController;
import com.hospital.management.medicalhistory.model.dto.MedicalHistoryDTO;

import java.util.Scanner;

public class MedicalHistoryPrint {
    private static MedicalHistoryController medicalHistoryController = new MedicalHistoryController();
    public void displayMenu() {
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("===== 진료기록 데이터 관리 =====");
                System.out.println("0. 이전 메뉴로");
                System.out.println("1. 진료기록 정보 전체 조회");
                System.out.println("2. 진료기록 번호로 정보 조회");
                System.out.println("3. 진료기록 정보 추가");
                System.out.println("4. 진료기록 정보 수정");
                System.out.println("5. 진료기록 정보 삭제");
                System.out.println("6. 진료비 미완인 환자의 전화번호 조회");

                int no = sc.nextInt();
                switch (no) {
                    case 0:
                        System.out.println("이전 메뉴로 돌아갑니다.");return;
                    case 1:
                        medicalHistoryController.selectAllMedicalHistory();break;
                    case 2:
                        medicalHistoryController.selectMedicalHistoryMedicalHistoryCode(insertMedicalHistoryCode());break;
                    case 3:
                        medicalHistoryController.insertMedicalHistory(insertMedicalHistoryDTO());break;
                    case 4:
                        medicalHistoryController.updateMedicalHistory(insertDoctorDTO2());break;
                    case 5:
                        medicalHistoryController.deleteMedicalHistory(insertMedicalHistoryCode());break;
                    case 6:
                        medicalHistoryController.selectPatientIsNotPay();break;
                    default:
                        System.out.println("번호를 잘못 입력하셨습니다.");break;
                }


            }while(true);

        }

    private MedicalHistoryDTO insertDoctorDTO2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("진료 내역 번호를 입력해주세요 : ");
        int medicalHistoryCode = sc.nextInt();
        System.out.print("진료 내용을 입력해주세요(수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        sc.nextLine();
        String medicalHistoryDetail = sc.nextLine();
        System.out.print("진료 비용을 입력해주세요(수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        int medicalHistoryPrice = sc.nextInt();
        System.out.print("진료비 완납 여부를 입력해주세요(Y/N) (수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        sc.nextLine();
        String medicalHistoryIsPay = sc.nextLine();
        System.out.print("진료 시간을 입력해주세요(수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        String medicalHistoryDatetime = sc.nextLine();
        System.out.print("진료에 걸린 시간(분)을 입력해주세요(수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        int medicalHistoryRunTime = sc.nextInt();
        System.out.print("환자 번호를 입력해주세요(수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        int patientCode = sc.nextInt();
        System.out.print("의사 번호를 입력해주세요(수정을 건너뛰고 싶다면 0을 입력해주세요) : ");
        int doctorCode = sc.nextInt();

        return new MedicalHistoryDTO(medicalHistoryCode,medicalHistoryDetail,medicalHistoryPrice,medicalHistoryIsPay,medicalHistoryDatetime,medicalHistoryRunTime,patientCode,doctorCode);

    }

    private MedicalHistoryDTO insertMedicalHistoryDTO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("진료 내용을 입력해주세요 : ");
        String medicalHistoryDetail = sc.nextLine();
        System.out.print("진료 비용을 입력해주세요 : ");
        int medicalHistoryPrice = sc.nextInt();
        System.out.print("진료비 완납 여부를 입력해주세요(Y/N) : ");
        sc.nextLine();
        String medicalHistoryIsPay = sc.nextLine();
        System.out.print("진료 시간을 입력해주세요 : ");
        String medicalHistoryDatetime = sc.nextLine();
        System.out.print("진료에 걸린 시간(분)을 입력해주세요 : ");
        int medicalHistoryRunTime = sc.nextInt();
        System.out.print("환자 번호를 입력해주세요 : ");
        int patientCode = sc.nextInt();
        System.out.print("의사 번호를 입력해주세요 : ");
        int doctorCode = sc.nextInt();

        return new MedicalHistoryDTO(medicalHistoryDetail,medicalHistoryPrice,medicalHistoryIsPay,medicalHistoryDatetime,medicalHistoryRunTime,patientCode,doctorCode);

    }

    private int insertMedicalHistoryCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("진료 기록 번호를 입력해주세요 : ");
        int medicalHistoryCode = sc.nextInt();
        return medicalHistoryCode;
    }

//    private MedicalHistoryDTO insertDoctorDTO2() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("의사 코드를 작성해주세요");
//        int doctorCode = sc.nextInt();
//        System.out.print("의사 이름을 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
//        sc.nextLine();
//        String doctorName = sc.nextLine();
//        System.out.print("의사 성별을 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
//        String doctorGender = sc.nextLine();
//        System.out.print("의사 휴대폰번호를 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
//        String doctorPhone = sc.nextLine();
//        System.out.print("의사 이메일을 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
//        String doctorEmail = sc.nextLine();
//        System.out.print("의사 직급 번호를 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
//        int rankCode = sc.nextInt();
//        System.out.print("의사 진단 부서 번호를 작성하여주세요 (수정을 건너뛰고 싶다면 0을 입력해주세요): ");
//        int departmentCode = sc.nextInt();
//
//        return  new MedicalHistoryDTO(doctorCode,doctorName,doctorGender,doctorPhone,doctorEmail,rankCode,departmentCode);
//    }
//
//    private MedicalHistoryDTO insertDoctorDTO() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("의사 이름을 작성하여주세요 : ");
//        String doctorName = sc.nextLine();
//        System.out.print("의사 성별을 작성하여주세요 : ");
//        String doctorGender = sc.nextLine();
//        System.out.print("의사 휴대폰번호를 작성하여주세요 : ");
//        String doctorPhone = sc.nextLine();
//        System.out.print("의사 이메일을 작성하여주세요 : ");
//        String doctorEmail = sc.nextLine();
//        System.out.print("의사 직급 번호를 작성하여주세요 : ");
//        int rankCode = sc.nextInt();
//        System.out.print("의사 진단 부서 번호를 작성하여주세요 : ");
//        int departmentCode = sc.nextInt();
//
//        return  new MedicalHistoryDTO(doctorName,doctorGender,doctorPhone,doctorEmail,rankCode,departmentCode);
//    }
//
//    private int insertDoctorCode() {
//
//    }
}
