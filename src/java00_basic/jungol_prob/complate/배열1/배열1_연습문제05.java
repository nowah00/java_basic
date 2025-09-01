package java00_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_연습문제05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int [13];

        while(true) {
            System.out.println("연도를 입력하세요.");
            int YEAR = in.nextInt();

            if (YEAR % 4 == 0) {
                arr[0] = 0;
                arr[1] = 31;
                arr[2] = 29;
                arr[3] = 31;
                arr[4] = 30;
                arr[5] = 31;
                arr[6] = 30;
                arr[7] = 31;
                arr[8] = 31;
                arr[9] = 30;
                arr[10] = 31;
                arr[11] = 30;
                arr[12] = 31;

                int month = in.nextInt();
                if (1<=month && month<=12) {
                    System.out.printf("YEAR: %d\nMONTH: %d\n입역하신 달의 날 수는 %d일입니다.\n\n", YEAR, month, arr[month]);
                } else if (month == 0){
                    System.out.print("YEAR: 0 MONTH: 0");
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다.\n\n");
                }
            } else if (YEAR % 4 != 0) {
                arr[0] = 0;
                arr[1] = 31;
                arr[2] = 28;
                arr[3] = 31;
                arr[4] = 30;
                arr[5] = 30;
                arr[6] = 30;
                arr[7] = 31;
                arr[8] = 31;
                arr[9] = 30;
                arr[10] = 31;
                arr[11] = 30;
                arr[12] = 31;
                int month = in.nextInt();
                if (1<=month && month<=12) {
                    System.out.printf("YEAR: %d\nMONTH: %d\n입역하신 달의 날 수는 %d일입니다.\n\n20", YEAR, month, arr[month]);
                } else if (month == 0){
                    System.out.print("YEAR: 0 MONTH: 0");
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다.\n\n");
                }
            }
        }
    }
}
