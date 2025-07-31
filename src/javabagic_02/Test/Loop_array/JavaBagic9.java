package javabagic_02.Test.Loop_array;

import java.util.Scanner;

public class JavaBagic9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("-------------------------------------------------------\n 1.학생수  |  2.점수입력  |  3.점수리스트  |  4.분석  |  5.종료  \n-------------------------------------------------------\n");

        int student = 0;
        int[] scores = new int[student];

        while(true){

            System.out.print("선택> ");
            int choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.print("학생수> ");
                int studentsCount = in.nextInt();
                student = studentsCount;
                break;
            case 2:
                for (int i=1; i<=student; i++){
                    System.out.printf("scores[%d]> ", i-1);
                    scores[i] = in.nextInt();
                }
            case 3:
                for (int i = 0; i < scores.length; i++) {
                    System.out.printf("scores[%d]> %d", i-1, scores[i]);
                }
            case 4:

            case 5:
                System.out.printf("-------------------------------------------------------\n 1.학생수  |  2.점수입력  |  3.점수리스트  |  4.분석  |  5.종료  \n-------------------------------------------------------\n");







        }
        }
    }
}
