package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 1;
        int b = 1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                a = 2 * b -1;
                if (a>10){
                    a = 1;
                    b = 1;
                }
                b++;
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}

