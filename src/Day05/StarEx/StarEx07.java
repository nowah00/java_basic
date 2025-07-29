package Day05.StarEx;

import java.util.Scanner;

public class StarEx07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for (int i=1; i<=num; i++) {
            for (int j = num-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*i-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int c = num-1;

        for (int n = 1; n <= num-1; n++) {
            for(int v = 1; v<=n; v++){ // 공백
                System.out.print(" ");
            }

            for (int m = 2*c-1; m>=1; m--){ // 역삼각형
                System.out.print("*");
            }
            c--;
            System.out.println();
        }
    }
}

