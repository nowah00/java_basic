package javabasic_01.day02;

public class BooleanEx {
    public static void main(String[] args) {
//        boolean stop = false;
//        if (stop){
//            System.out.println("중지합니다");
//        }else {
//            System.out.println("시작합니다");
//        }

        // int x = 30;
        // 변수 x의 값이 20인가?
        // 변수 x의 값이 20이 아닌가?
        // 변수 x의 값이 0보다 크고 30보다 작은가?
        // 변수 x의 값이 0보다 작거나 30보다 크거나 같은가?

        // 각 결과 출력

        int x = 30;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (0 < x && 30 > x);
        boolean result4 = (0 > x || 30 <= x);

        System.out.println("변수 x의 값이 20인가?\n" + result1);
        System.out.println("변수 x의 값이 20이 아닌가?\n" + result2);
        System.out.println("변수 x의 값이 0보다 크고 30보다 작은가?\n" + result3);
        System.out.println("변수 x의 값이 0보다 작거나 30보다 크거나 같은가?\n" + result4);
    }
}