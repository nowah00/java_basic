package jungol.배열1;

import java.util.Scanner;

public class 배열1_자가진단01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] array = new char [10];

        for (int i = 0; i < array.length; i++) {
            String input = in.nextLine();
            array [i] = input.charAt(0);
        }
        for (char c : array) {
            System.out.print(c);
        }
    }
}
