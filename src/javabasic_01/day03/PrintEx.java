package javabasic_01.day03;

public class PrintEx {
    public static void main(String[] args) {

        System.out.printf("과목명: %s\n", "자바");
        System.out.printf("과목명: %1$s 이름: %2$s\n", "자바", "하원");
        System.out.printf("과목명: %1$s 이름: %2$s 학번: %3$s\n", "자바", "하원", "19177036");

        //정수 123을 printf() 출력하고싶다
        System.out.printf("%d \n", 123);

        //정수 ____123을 printf() 출력하고싶다. 6자리 정수 출력. 왼쪽 공백
        System.out.printf("%6d \n", 123);
        //정수 ____123을 printf() 출력하고싶다. 6자리 정수 출력. 오른쪽 공백
        System.out.printf("%-6d \n", 123);
        //정수 000123을 printf() 출력하고싶다. 6자리 정수 출력.
        System.out.printf("%06d \n", 123);

        System.out.println(" ===========실수 표현===========");

        // 정수 7자리 = 소수점 = 소수2자리 . 왼쪽 빈자리 공백 ____123.45
        System.out.printf("%10.2f\n",123.45);

        System.out.println(" ===========문자열 표현===========");

        // 문자열은 %s 포맷       abc 출력
        System.out.printf("%s\n", "abc");
        // 문자열은 %s 포맷       ___abc 출력
        System.out.printf("%6s\n", "abc");

        // 특수 문자 \t, \n %%
        System.out.printf("소금물의 농도 %% %d\n", 35);
    }
}
