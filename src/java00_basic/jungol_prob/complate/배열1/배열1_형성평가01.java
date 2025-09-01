package java00_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_형성평가01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] array = new char [10];

        for (int i = 0; i < array.length; i++) {
            String input = in.nextLine();
            array[i] = input.charAt(0);
        }
        for (int j = array.length-1; j >= 0; j--){
            System.out.print(array[j] + " ");
        }
    }
}
