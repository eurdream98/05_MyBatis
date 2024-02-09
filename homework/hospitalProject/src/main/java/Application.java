import com.hospital.management.department.view.DepartmentPrint;
import com.hospital.management.doctor.view.DoctorPrint;
import com.hospital.management.medicalhistory.view.MedicalHistoryPrint;
import com.hospital.management.patient.view.PatientPrint;
import com.hospital.management.rank.view.RankPrint;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("===== 전체 메뉴 =====");
            System.out.println("0. 프로그램 종료");
            System.out.println("1. 환자 데이터 관리 ");
            System.out.println("2. 의사 데이터 관리");
            System.out.println("3. 직급 데이터 관리");
            System.out.println("4. 진료과 데이터 관리");
            System.out.println("5. 진료기록 데이터 관리");



            int no = sc.nextInt();

            switch (no) {
                case 0:System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                    new PatientPrint().displayMenu();
                    break;
                case 2:
                    new DoctorPrint().displayMenu();
                    break;
                case 3:
                    new RankPrint().displayMenu();
                    break;
                case 4:
                    new DepartmentPrint().displayMenu();
                    break;
                case 5:
                    new MedicalHistoryPrint().displayMenu();
                    break;
                default :
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        } while(true);

    }
}
