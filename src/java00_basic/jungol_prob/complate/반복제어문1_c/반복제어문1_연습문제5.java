package java00_basic.jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_연습문제5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int count = 0, total = 0;

        while (num != 0){
            if (num%2!=0){
                count++;
                total += num;
            }
            num = in.nextInt();
        }
        int avg = total / count;

        System.out.printf("홀수의 합계 = %d\n홀수의 평균 = %d", total, avg);
    }
}
