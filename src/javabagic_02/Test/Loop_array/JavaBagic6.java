package javabagic_02.Test.Loop_array;

import java.util.Scanner;

public class JavaBagic6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = n;

        for (int i=1; i<=n; i++){
            for (int j=x-1; j>=0; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            x--;
            System.out.println();
        }
    }
}
