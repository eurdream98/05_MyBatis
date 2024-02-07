package com.hospital.management.patient.view;

import com.hospital.management.patient.controller.PatientController;
import com.hospital.management.patient.model.dao.PatientMapper;
import com.hospital.management.patient.model.dto.PatientDTO;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalPrint {
    private static PatientController patientController = new PatientController();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("===== 환자 데이터 관리 =====");
            System.out.println("1. 환자 정보 전체 조회");
            System.out.println("2. 환자 코드로 환자 조회");
            System.out.println("3. 성별에 따른 환자 조회");
            System.out.println("4. 진료과로 환자 조회");
            System.out.println("5. 현재 입원 중인 환자 조회");
            System.out.println("6. 환자 정보 등록");
            System.out.println("7. 환자 정보 수정");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                patientController.selectAllPatient();
                break;
                case 2:
                    patientController.selectPatientPatientCode(insertPatientCode());
                    break;
                case 3:
                    patientController.selectPatientPatientGender(insertPatientGender());
                    break;
                case 4:
                    patientController.selectPatientPatientDepartment(insertPatientDepartment());
                    break;
                case 5:
                    patientController.selectPatientPatientAdmission(insertPatientAdmission());
                    break;
                case 6:
                    patientController.insertPatient(insertPatientDTO());
                    break;
                case 7:
                    patientController.updatePatient(updatePatientDTO());
                    break;
            }


        }while(true);

    }

    private PatientDTO updatePatientDTO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("환자의 번호를 입력해주세요 : ");
        int patientCode = sc.nextInt();
        System.out.print("환자의 이름을 입력해주세요 : ");
        sc.nextLine();
        String patientName = sc.nextLine();
        System.out.print("환자의 나이를 입력해주세요 : ");
        int patientAge = sc.nextInt();
        System.out.print("환자의 성별을 입력해주세요 : ");
        sc.nextLine();
        String patientGender = sc.nextLine();
        System.out.print("환자의 핸드폰 번호를 입력해주세요 : ");
        String patientPhone = sc.nextLine();
        System.out.print("환자의 이메일을 입력해주세요 : ");
        String patientEmail = sc.nextLine();
        System.out.print("환자의 아픈 증상을 입력해주세요 : ");
        String patientSick = sc.nextLine();
        System.out.print("환자의 입원 여부를 입력해주세요 : ");
        String patientAdmission = sc.nextLine();
        System.out.print("환자의 병과코드를 입력해주세요 : ");
        int departmentCode = sc.nextInt();

        return  new PatientDTO(patientCode,patientName,patientAge,patientGender,patientPhone,patientEmail,patientSick,patientAdmission,departmentCode);
    }

    private PatientDTO insertPatientDTO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("환자의 이름을 입력해주세요 : ");
        String patientName = sc.nextLine();
        System.out.print("환자의 나이를 입력해주세요 : ");
        int patientAge = sc.nextInt();
        System.out.print("환자의 성별을 입력해주세요 : ");
        sc.nextLine();
        String patientGender = sc.nextLine();
        System.out.print("환자의 핸드폰 번호를 입력해주세요 : ");
        String patientPhone = sc.nextLine();
        System.out.print("환자의 이메일을 입력해주세요 : ");
        String patientEmail = sc.nextLine();
        System.out.print("환자의 아픈 증상을 입력해주세요 : ");
        String patientSick = sc.nextLine();
        System.out.print("환자의 입원 여부를 입력해주세요 : ");
        String patientAdmission = sc.nextLine();
        System.out.print("환자의 병과코드를 입력해주세요 : ");
        int departmentCode = sc.nextInt();

        return  new PatientDTO(patientName,patientAge,patientGender,patientPhone,patientEmail,patientSick,patientAdmission,departmentCode);
    }

    private String insertPatientAdmission() {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 입원 여부를 입력해주세요(y,n) : ");
        String patientAdmission = sc.nextLine().toUpperCase();
        return patientAdmission;
    }

    private String insertPatientDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("병과를 입력해주세요 : ");
        String departmentName = sc.nextLine();
        return departmentName;
    }

    private Map<String,String> insertPatientGender() {
        System.out.print("성별을 입력하여주세요 : ");
        Scanner sc = new Scanner(System.in);
        String patientGender = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        map.put("patientGender",patientGender);
        return map;
    }

    private int insertPatientCode() {
        Scanner sc = new Scanner(System.in);

        System.out.print("찾고자 하는 환자 번호를 입력하여주세요 : ");
        int no = sc.nextInt();

        return no;
    }


}
