package java00_basic.jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_형성평가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int a = 0;
        int b = 0;

        while(true){
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else if (n%3==0) {
                a++;
            } else if (n%5==0) {
                b++;
            }
            count++;
        }
        System.out.print(count - a - b);
    }
}
