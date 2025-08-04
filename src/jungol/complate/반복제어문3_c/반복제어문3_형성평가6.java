package jungol.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n;
        int z = 1;

        for (int i=1; i<=n; i++){

            for (int j=2*m-2; j>=1; j--){
                System.out.print(" ");
            }
            m--;
            z=1;
            for (int k=1; k<=i; k++) {
                System.out.print(z + " ");
                z++;
            }
            System.out.println();
        }
    }
}

