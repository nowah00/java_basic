package jungol.Beginner;

import java.util.Scanner;

public class 별삼각형1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        star:
        while (true) {
            System.out.print("종류를 입력하세요. ");
            int m = in.nextInt();

            switch (m) {
                case 1 :
                    System.out.print("삼각형의 높이를 입력하세요. ");
                    int n = in.nextInt();

                    for (int i=1; i<=n; i++){
                        for (int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    } break;

                case 2 :
                    System.out.print("삼각형의 높이를 입력하세요. ");
                    n = in.nextInt();
                    int a = n;
                    for (int i=1; i<=n; i++){
                        for (int j=a; j>=1; j--){
                            System.out.print("*");
                        }
                        a--;
                        System.out.println();
                    } break;

                case 3 :
                    System.out.print("삼각형의 높이를 입력하세요. ");
                    n = in.nextInt();
                    a = n;
                    for (int i=1; i<=n; i++) {
                        for (int j = a; j >= 1; j--) {
                            System.out.print(" ");
                        }
                        a--;
                        for (int k=1; k<=2*i-1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    } break;
                default:
                    System.out.println("INPUT ERROR!");
                    break star;
            }
        }
    }
}
