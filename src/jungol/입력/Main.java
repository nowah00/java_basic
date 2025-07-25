package jungol.입력;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//입력 - 연습문제1
//        int a = 10;
//        char b = 65;
//
//        System.out.printf("a = %d\n",a);
//        System.out.printf("b = %c\n",b);

//입력 - 연습문제2
//        int a = 20;
//        int b = 10;
//        System.out.println(a + " " + b);

//입력 - 연습문제3
//        int a = 10;
//        int b = 20;
//        int result = a + b;
//        System.out.printf("%d + %d = %d\n", a, b, result);
//
//        a = 30;
//        b = 40;
//        result = a + b;
//        System.out.printf("%d + %d = %d", a, b, result);

//입력 - 연습문제4
//        int a = 5;
//        int b = 2;
//        double pie =3.140000;
//        double result1 = a * b * pie;
//        double result2 = a * a * pie;
//
//        System.out.printf("원주 = %d * %d * %s = %s\n", a, b, pie, result1);
//        System.out.printf("넓이 = %d * %d * %s = %s", a, a, pie, result2);

//입력 - 연습문제5
//        float x= 1.2340f;
//        float y= 10.3459f;
//        System.out.printf("전체 7자리로 맞추고 소수 4자리까지 출력\n");
//        System.out.printf("x =  %.4f\n",x);
//        System.out.printf("y = %.4f\n\n",y);
//        System.out.printf("소수 2자리까지 출력(반올림)\n");
//        System.out.printf("x = %.2f\n",x);
//        System.out.printf("y = %.2f\n",y);

//입력 - 연습문제6
//        int a, age;
//        Scanner input= new Scanner(System.in);
//        System.out.println("당신의 나이는 몇 살입니까");
//        num1 = input.nextInt();
//        age = a;
//        System.out.printf("당신의 나이는 %d살이군요", age);

//입력 - 연습문제7
//        int a,b, result1, result2;
//        Scanner input= new Scanner(System.in);
//
//        System.out.println("첫번쨰 수를 입력하세요");
//        a = input.nextInt();
//        System.out.println("두번째 수를 입력하세요");
//        b = input.nextInt();
//
//        result1 = a + b;
//        result2 = a * b;
//
//        System.out.println(a + "+" + b + "=" + result1);
//        System.out.println(a + "*" + b + "=" + result2);

//입력 - 연습문제8
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("키를 입력하세요");
        a = input.nextInt();

        System.out.println("몸무게를 입력하세요");
        b = input.nextInt();

        input.nextLine();

        System.out.println("이름을 입력하세요");
        String c = input.nextLine();

        System.out.printf("키 = %d\n", a);
        System.out.printf("몸무게 = %d\n", b);
        System.out.printf("이름 = %s", c);

//입력 - 연습문제9
    }
}
