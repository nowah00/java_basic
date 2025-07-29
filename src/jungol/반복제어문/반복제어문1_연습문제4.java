package jungol.반복제어문;

import java.util.Scanner;

public class 반복제어문1_연습문제4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int count = 0, total = 0;

        while (num != 0){
            count++;
            total += num;

            num = in.nextInt();
        }
        double avg = (double) total / count;

        System.out.printf("입력된 자료의 개수 = %d\n입력된 자료의 합계 = %d\n입력된 자료의 평균 = %.2f", count, total, avg);
    }
}
