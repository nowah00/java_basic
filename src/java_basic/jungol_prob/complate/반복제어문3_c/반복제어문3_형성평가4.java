package java_basic.jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int z = in.nextInt();
        int u = z;

        for (int i = 1; i <= z; i++){
            for (int j = 1; j < i; j++){ // 공백
                System.out.print(" ");
            }
            for (int k=2*u-1; k>=1 ; k--){ // 역삼각형
                System.out.print("*");
            }
            u--;
            System.out.println();
        }

        int w = z;

        for (int l=0; l<z-1; l++){
            for (int m=w-1; m>=1; m--){
                System.out.print(" ");
            }
            w--;
            for (int n=1; n<=2*(l+1)-1; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

