package java00_basic.jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_형성평가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        for (int i=1; i<=num; i++){
            System.out.print(i + " ");
        }
    }
}
