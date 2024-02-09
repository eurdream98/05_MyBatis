package com.hospital.management.rank.view;

import com.hospital.management.rank.controller.RankController;
import com.hospital.management.rank.model.dto.RankDTO;

import java.util.Scanner;

public class RankPrint {
    private static RankController doctorController = new RankController();
    public void displayMenu() {
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("===== 직급 데이터 관리 =====");
                System.out.println("0. 이전 메뉴로");
                System.out.println("1. 직급 정보 전체 조회");
                System.out.println("2. 직급 번호에 따른 직급명 출력");
                System.out.println("3. 직급별 의사 조회");
                int no = sc.nextInt();
                switch (no) {
                    case 0:
                        System.out.println("이전 메뉴로 돌아갑니다.");return;
                    case 1:
                        RankController.selectAllRank();break;
                    case 2:
                        RankController.selectRankRankCode(insertRankCode());break;
                    case 3:
                        RankController.selectRankDoctor();break;
                    default:
                        System.out.println("번호를 잘못 입력하셨습니다.");break;
                }
            }while(true);

        }

    private int insertRankCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("직급 번호를 입력해주세요 : ");
        int rankName = sc.nextInt();
        return rankName;
    }

}
