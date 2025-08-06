package javabasic_02.Day08.String.Loop_array;

import java.util.Scanner;

public class JavaBagic4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int x=1; x<=10; x++){ // x의 범위 10 이하의 자연수
            for (int y=1; y<=10; y++){ // y의 범위 10 이하의 자연수
                if(4*x + 5*y == 60){ // 식이 성립할 때,
                    System.out.printf("(%d, %d) ", x, y); // 해당 값을 출력
                }
            }
        }
    }
}
