package Day03;

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
    }
}
