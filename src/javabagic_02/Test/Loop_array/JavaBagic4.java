package javabagic_02.Test.Loop_array;

import java.util.Scanner;

public class JavaBagic4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int x=1; x<=10; x++){
            for (int y=1; y<=10; y++){
                if(4*x + 5*y == 60){
                    System.out.printf("(%d, %d) ", x, y);
                }
            }
        }
    }
}
