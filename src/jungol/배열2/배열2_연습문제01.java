package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []count = new int[11];

        while(true){
            int num = in.nextInt();
            if (num<1 || num>100){ // 1-10 정수 외에 입력될 경우 입역 반복은 끝
                break;
            }
            count[num]++; // 넘어갈때마다 해당 숫자에 인덱스에 수가 카운트
        }

        for (int i=1; i<=10; i++){
            if (count[i]!=0) {
                System.out.println(i + " : " + count[i] + "개"); // i에 i 인덱스 카운트된 수 출력
            }
        }
    }
}
