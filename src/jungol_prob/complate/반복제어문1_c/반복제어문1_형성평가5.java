package jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double result;

        choice:
        while(true) {
            System.out.print("Base = ");
            int base = in.nextInt();
            System.out.print("Height = ");
            int height = in.nextInt();
            result = (double) base * height/2;
            System.out.printf("Triangle width = %.1f\n\n", result);

            System.out.print("Continue? ");
            in.nextLine();
            String answer = in.nextLine();

            if (answer.equals("Y") || answer.equals("y"));
                else break;
        }
    }
}