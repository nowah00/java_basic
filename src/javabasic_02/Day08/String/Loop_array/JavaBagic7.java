package javabasic_02.Day08.String.Loop_array;

import java.util.Scanner;

public class JavaBagic7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = n;

        for (int i=1; i<=n; i++) {
            for (int j = x - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("@");
            }
            x--;
            System.out.println();
        }
        int y = n-1;
        for (int i=1; i<=n-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=2*y-1; k>=1; k--){
                System.out.print("@");
            }
            y--;
            System.out.println();
        }
    }
}
