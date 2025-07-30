package javabagic_01.Day03;

public class OperationEx02 {
    public static void main(String[] args) {

// 비교연산자 동등 (==, !=), 크기 (<, <=, >, >=) 를 평가해서 boolean 타임인 true, false 를 산출한다
        int n1 = 10;
        int n2 = 10;

        // n1과 n2 의 값이 같은가? 결과를 result1 에 저장해서 출력
        boolean result1 = (n1 == n2);
        System.out.println(result1);

        // n1과 n2 의 값이 다른가? 결과를 result2 에 저장해서 출력
        boolean result2 = (n1 != n2);
        System.out.println(result2);

        boolean result3 = (n1 > n2);
        System.out.println(result3);

        int n3 = 1;
        double n4 = 1.0;
        System.out.println(n3 == n4);
    }
}
