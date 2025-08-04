package jungol.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("첫 줄에 자연수 n이 주어진다.");
        int n = in.nextInt();
        int g = 1;

        for (int i = 1; i <= n; i++){ // n번 반복 할 수 있게 해주는거지.

            for (int j = 1; j <= i; j++) { // 자. 이 명령어로는 가로로 몇 번 반복할지 하게 해주는거야 -> 그래서 i번 반복하게 해주는거지.
                System.out.print(g + " "); // g가 i번 1씩 증가하게 하고
                g++; // 다음 순서의 g가 다음 줄 첫번째로 시작할 수 있도록 후치 증가를 통해 넘어갈떄마다 증가하는거지.
            }
            System.out.println();
        }
    }
}

