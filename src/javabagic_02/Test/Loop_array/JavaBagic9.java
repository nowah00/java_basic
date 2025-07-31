package javabagic_02.Test.Loop_array;

import java.util.Scanner;

public class JavaBagic9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int student = 0;
        int[] scores = new int[1];
        int max = scores[0];
        int total = 0;
        double avg = 0;

        System.out.printf("-------------------------------------------------------\n 1.학생수  |  2.점수입력  |  3.점수리스트  |  4.분석  |  5.종료  \n-------------------------------------------------------\n");

        Choice:
        while(true){

            System.out.print("선택> ");
            int choice = in.nextInt();

        switch (choice){
            case 1:
                total=0;
                avg=0;
                System.out.print("학생수> ");
                student = in.nextInt();
                scores = new int[student];
                break;

            case 2:
                if (student==0){
                    System.out.println("학생수가 없습니다.");
                } else {
                for (int i=0; i<=student-1; i++){

                    System.out.printf("scores[%d]> ", i);
                    scores[i] = in.nextInt();
                    max = Math.max(max, scores[i]);
                    total += scores[i];
                    avg = (double) total / student;
                } }break;

            case 3:
                if (student==0){
                    System.out.println("입력된 점수가 없습니다.");
                } else {
                for (int i = 0; i < scores.length; i++) {
                    System.out.printf("scores[%d]> %d\n", i, scores[i]);
                }} break;

            case 4:
                if (student==0){
                    System.out.println("입력된 점수가 없습니다.");
                } else {
                System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);}
                break;

            case 5:
                System.out.println("프로그램 종료");
                break Choice;
            default:
                System.out.println("메뉴 내에서 선택해주세요");
                break;
        }
            System.out.printf("-------------------------------------------------------\n 1.학생수  |  2.점수입력  |  3.점수리스트  |  4.분석  |  5.종료  \n-------------------------------------------------------\n");
        }
    }
}
