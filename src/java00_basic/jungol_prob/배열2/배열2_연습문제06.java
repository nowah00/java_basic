package java00_basic.jungol_prob.배열2;

import java.util.Scanner;

public class 배열2_연습문제06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] student = new int[3][3];
        int kor=0, eng=0, math=0;
        int[] studentSum = new int[3];
        int[] subjectSum = new int[3];
        int total = 0;
        for (int i=0; i<3; i++){
            System.out.println(i + 1 + "번째 학생의 점수 ");
            for (int j=0; j<3; j++){
                student[i][j] = in.nextInt();
                studentSum[i] += student[i][j];
            }
            System.out.println();
        }
        System.out.print("     국어 영어 수학 총점\n");
        for (int i=0; i<3; i++){
            System.out.print(" " + (i+1) + "번 ");
            for (int j=0; j<3; j++){
                System.out.print(" " + student[i][j] + " ");
            }
            System.out.print(" " + studentSum[i]);
            System.out.println();
        }
        for (int n=0; n<3; n++){
            for(int m=0; m<3; m++){
                subjectSum[n] += student[m][n];
                total += student[m][n];
            }
        }
        System.out.print(" 합계 ");
        for (int i = 0; i < 3; i++) {
            System.out.print(subjectSum[i] + " ");
        }
        System.out.print(" " + total);
    }
}
