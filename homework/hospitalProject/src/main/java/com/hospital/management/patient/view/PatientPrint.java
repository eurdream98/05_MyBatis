package com.hospital.management.patient.view;

import com.hospital.common.SelectCriteria;
import com.hospital.management.patient.controller.PatientController;
import com.hospital.management.patient.model.dto.PatientDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PatientPrint {
    private static PatientController patientController = new PatientController();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("===== 환자 데이터 관리 =====");
            System.out.println("0. 이전 메뉴로");
            System.out.println("1. 환자 정보 전체 조회");
            System.out.println("2. 환자 코드로 환자 조회");
            System.out.println("3. 성별에 따른 환자 조회");
            System.out.println("4. 진료과로 환자 조회");
            System.out.println("5. 현재 입원 중인 환자 조회");
            System.out.println("6. 환자 정보 등록");
            System.out.println("7. 환자 정보 수정");
            System.out.println("8. 환자 정보 삭제");
            System.out.println("9. 나이대별(10살 기준) 환자 조회");
            System.out.println("10. 검색 기준(환자명(검색어와 완전 일치하는 환자들 조회) 혹은 증상(검색어를 일부 혹은 전체와 일치하는 환자들 조회))에 따른 환자 조회");
            System.out.println("11. 환자별 진료과 검색");

            int no = sc.nextInt();
            switch (no) {
                case 0:
                    System.out.println("이전 메뉴로 돌아갑니다.");return;
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
                case 8:
                    patientController.deletePatient(insertPatientCode());
                    break;
                case 9:
                    patientController.selectByAge(insertPatientAgeForSelect());
                    break;
                case 10:
                    patientController.selectByCriteria(subSelectByCriteria());
                    break;
                case 11:
                    patientController.selectPatientDepartment();
                    break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }


        }while(true);

    }

    private SelectCriteria subSelectByCriteria() {
        SelectCriteria selectCriteria = new SelectCriteria();

        System.out.println("===== 검색 메뉴 =====");
        System.out.println("1. 환자 이름에 따른 검색(완전 일치)");
        System.out.println("2. 환자 증상에 따른 검색(일부 일치)");
        System.out.println("3. 환자 이름과 증상에 따른 검색");
        System.out.println("4. 환자 전체 조회");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        switch(no){
            case 1:
                selectCriteria=selectCriteriaName();
                break;
            case 2:
                selectCriteria=selectCriteriaSick();
                break;
            case 3:
                selectCriteria=selectCriteriaBoth();
                break;
            case 4:
                selectCriteria=selectCriteriaNone();
                break;
        }
        return selectCriteria;
    }

    private SelectCriteria selectCriteriaNone() {
        SelectCriteria selectCriteria = new SelectCriteria();

        String option = "none";

        selectCriteria.setOption(option);

        return selectCriteria;
    }

    private SelectCriteria selectCriteriaBoth() {
        SelectCriteria selectCriteria = new SelectCriteria();

        Scanner sc = new Scanner(System.in);
        String option = "both";

        System.out.print("이름에 대한 검색어를 입력해주세요 : ");
        String nameValue = sc.nextLine();

        System.out.print("증상에 대한 검색어를 입력해주세요 : ");
        String sickValue = sc.nextLine();

        selectCriteria.setOption(option);
        selectCriteria.setNameValue(nameValue);
        selectCriteria.setSickValue(sickValue);

        return selectCriteria;
    }

    private SelectCriteria selectCriteriaSick() {
        SelectCriteria selectCriteria = new SelectCriteria();

        Scanner sc = new Scanner(System.in);
        String option = "sick";

        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();

        selectCriteria.setOption(option);
        selectCriteria.setSickValue(value);

        return selectCriteria;
    }

    private SelectCriteria selectCriteriaName() {
        SelectCriteria selectCriteria = new SelectCriteria();


        Scanner sc = new Scanner(System.in);
        String option = "name";
        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();

        selectCriteria.setOption(option);
        selectCriteria.setNameValue(value);

        return selectCriteria;
    }

    private int insertPatientAgeForSelect() {
        System.out.print("조회하고자 하는 환자의 나이대를 입력해주세요 ex(10,20,30...): ");
        Scanner sc = new Scanner(System.in);
        int selectedAge = sc.nextInt();
        return selectedAge;
    }

    private PatientDTO updatePatientDTO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("환자의 번호를 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        int patientCode = sc.nextInt();
        System.out.print("환자의 이름을 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        sc.nextLine();
        String patientName = sc.nextLine();
        System.out.print("환자의 나이를 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        int patientAge = sc.nextInt();
        System.out.print("환자의 성별을 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        sc.nextLine();
        String patientGender = sc.nextLine();
        System.out.print("환자의 핸드폰 번호를 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        String patientPhone = sc.nextLine();
        System.out.print("환자의 이메일을 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        String patientEmail = sc.nextLine();
        System.out.print("환자의 아픈 증상을 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        String patientSick = sc.nextLine();
        System.out.print("환자의 입원 여부를 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
        String patientAdmission = sc.nextLine();
        System.out.print("환자의 병과코드를 입력해주세요 (수정을 건너뛰려면 0을 입력해주세요.): ");
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

        System.out.print("환자 번호를 입력하여주세요 : ");
        int no = sc.nextInt();

        return no;
    }


}
