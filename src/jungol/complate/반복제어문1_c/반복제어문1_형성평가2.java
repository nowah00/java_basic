package jungol.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_형성평가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int odd = 0;
        int even = 0;

        while (num>0){
            if (num%2 == 0){
                even++;
            } else if (num%2 != 0) {
                odd++;
            } else {
                break;
            }
            num = in.nextInt();
        }
        System.out.printf("odd : %d\neven : %d", odd, even);
    }
}
