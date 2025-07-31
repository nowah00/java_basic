package javabagic_02.Test.Loop_array;

import java.util.Scanner;

public class JavaBagic3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true){

            int num = 0;
            int sum = 0;

            for (int i=1; i<=2; i++) {
                num = (int) (Math.random() * 6) + 1;
                sum += num;
                System.out.print(num + " ");
            }
            System.out.println();
            if (sum==5){
                break;
            }
        }
    }
}
