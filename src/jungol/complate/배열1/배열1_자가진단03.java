package jungol.complate.배열1;

import java.util.Scanner;

public class 배열1_자가진단03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] arr = new char[10];

        for (int i = 0; i < arr.length; i++) {
            String input = in.nextLine();
            arr[i] = input.charAt(0);
        }
        System.out.print(arr[0] + " " + arr[3] + " " + arr[6]);
    }
}
