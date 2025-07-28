package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {

// 1부터 차례로 누적하여 합을 구하다가 합이 입력받은 수를 넘으면 중단하고 마지막으로 더해진 값과 그 때까지의 합을 출력하는 프로그램을 작성하시오.
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int count = 0;

        for (int i=1; i<=number; i++) {
            count = count + i;
            if (count > number) {
                System.out.print(i + " ");
                break;
            }
        }
        System.out.print(count);







    }
}
