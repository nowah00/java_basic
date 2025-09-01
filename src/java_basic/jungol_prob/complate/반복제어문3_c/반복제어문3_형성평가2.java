package java_basic.jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (1<=num && num<=100){
            if (num%num==0){
                for (int i=1; i<=10; i++){
                    int result = num * i;
                    System.out.print(result + " ");
                }
            }
        } else {
            System.out.print("1부터 100사이의 정수를 입력해주세요.");
        }
    }
}

