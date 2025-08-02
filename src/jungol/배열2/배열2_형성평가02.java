package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] person = new int[11];  // 0~9: 0~99점, 10: 100점

        while(true){
            int score = in.nextInt(); // 정수 입력 받음

            if(score == 0) break;

            if(score == 100){
                person[10]++;
            } else {
                person[score / 10]++;
            }
        }

        for (int i = 10; i >= 1; i--) {
            if(person[i]!=0){
            System.out.printf("%d0 : %d person\n", i, person[i]);
            }
        }
    }
}