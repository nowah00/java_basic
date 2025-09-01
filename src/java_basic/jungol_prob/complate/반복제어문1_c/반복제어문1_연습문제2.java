package java_basic.jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_연습문제2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 1;
        int total = 0;

        while (num <= 10){
            total = total + num;
            num += 1;
        }
        System.out.printf("1부터 10까지의 합 = %d\nwhile문이 끝난 후의 num의 값 = %d", total, num);
    }
}
