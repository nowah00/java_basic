package jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int z = 65;
        int m = n;
        int v = 0;

        if (n<=6) {
            for (int i = 1; i <= n; i++) {
                for (int j = m; j >= 1; j--) {
                    System.out.print((char) z);
                    z++;
                }
                m--;

                for (int k = 1; k <= i - 1; k++) {
                    System.out.print(v);
                    v++;
                }
                System.out.println();
            }
        } else {
            System.out.print("Nope");
        }
    }
}

