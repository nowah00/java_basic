package jungol_prob.배열2;

import java.util.Scanner;

public class 배열2_연습문제02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] count = new int [10];

        while (true){
            String num = in.nextLine(); // 정수 입력

            int length = num.length(); // 정수의 길이 입력

            char number = num.charAt(length-1); // 정수의 끝자리 입력

            if (num.equals("0")){
                break;
            }
            switch (number){
                case '0':
                    count[0]++;
                    break;
                case '1':
                    count[1]++;
                    break;
                case '2':
                    count[2]++;
                    break;
                case '3':
                    count[3]++;
                    break;
                case '4':
                    count[4]++;
                    break;
                case '5':
                    count[5]++;
                    break;
                case '6':
                    count[6]++;
                    break;
                case '7':
                    count[7]++;
                    break;
                case '8':
                    count[8]++;
                    break;
                case '9':
                    count[9]++;
                    break;
            }
        }
        for (int i = 0; i <10; i++) {
            if (count[i]!=0){
                System.out.printf("%d : %d개\n",i,count[i]);
            }
        }
    }
}
