import com.hospital.management.patient.controller.PatientController;
import com.hospital.management.patient.view.HospitalPrint;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 전체 메뉴 =====");
        System.out.println("1. 환자 데이터 관리 ");


        int no = sc.nextInt();

        switch (no){
            case 1: new HospitalPrint().displayMenu();
        }
    }
}
