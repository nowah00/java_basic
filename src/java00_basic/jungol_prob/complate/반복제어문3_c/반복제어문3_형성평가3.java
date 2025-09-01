package java00_basic.jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        ================================
        int n = num; // n을 넣지 않고 num 을 그대로 적용할 경우 첫번째 for 문에도 간섭이 생기기에 n을 지정하여 별개로 함.

        for (int l=1; l<=num; l++){
            for (int m = n-1; m >= 1; m--){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}

