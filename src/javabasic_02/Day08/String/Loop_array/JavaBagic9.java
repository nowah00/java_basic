package javabasic_02.Day08.String.Loop_array;

import java.util.Scanner;

public class JavaBagic9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = "----------------------------------------------------------\n 1.학생수  |  2.점수입력  |  3.점수리스트  |  4.분석  |  5.종료  \n----------------------------------------------------------\n";

        int student = 0, max = 0, sum = 0; // 학생의 수, 최댓값, 총합을 저장하는 변수
        int[] scores = null; // 배열 생성
        double avg = 0; // 평균 변수 생성

        System.out.print(text);

        Choice:
        while(true){
            System.out.print("선택> ");
            int choice = in.nextInt();

        switch (choice){
            case 1:
                max=0;
                sum=0;
                avg=0; // 최댓값과 총합, 평균을 학생 수를 재지정할때마다 초기화
                System.out.print("학생수> ");
                student = in.nextInt();
                scores = new int[student]; // 배열의 공간 수를 재지정
                break;

            case 2:
                if (student==0){
                    System.out.println("학생수가 없습니다."); // 예외일 때 메세지
                } else {
                for (int i=0; i<=student-1; i++){ // 학생 수만큼 반복
                    System.out.printf("scores[%d]> ", i);
                    scores[i] = in.nextInt();
                    max = Math.max(max, scores[i]); // 최댓값 계산 후 저장
                    sum += scores[i]; // 총합 계산 후 저장
                    avg = (double) sum / student; // 평균 계산 후 저장
                }
                }break;

            case 3:
                if (student==0){
                    System.out.println("입력된 점수가 없습니다.");
                } else {
                for (int i = 0; i < scores.length; i++) {
                    System.out.printf("scores[%d]> %d\n", i, scores[i]);
                }
                } break;

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
            System.out.print(text);
        }
    }
}
