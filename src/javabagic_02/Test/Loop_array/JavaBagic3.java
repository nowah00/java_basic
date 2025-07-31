package javabagic_02.Test.Loop_array;

import java.util.Scanner;

public class JavaBagic3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true){

            int num = 0;
            int total = 0;

            for (int i=1; i<=2; i++) {
                num = (int) (Math.random() * 6) + 1;
                total += num;
                System.out.print(num + " ");
            }
            System.out.println();
            if (total==5){
                break;
            }
        }
    }
}
