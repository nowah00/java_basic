package java_advanced.day17.lambdaEx.lambda01;

import java.util.Scanner;

public class LambdaEx01 {
    //사용자가 입력한 두개의 숫자 결과를 처리
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        action((x,y) -> {
            System.out.println(x + y);
                }
        );
        action((x,y) -> {
                    System.out.println(x-y);
                }
        );
    }

    public static void action(Calculable calculable) {
        //데이터 부
        System.out.print("Enter Num1: ");
        int x = in.nextInt();
        System.out.print("Enter Num2: ");
        int y = in.nextInt();
        calculable.calculate(x,y);
    }
}
