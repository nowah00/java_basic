package Day04;

import java.util.Scanner;

public class ForEx02 {
    public static void main(String[] args) {
      // 1-10까지의 합 출력 : 55 작성하세요
        int result = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

        System.out.println("나열식 합 : " + result);

        System.out.println("=======================");

        result = 0;
        for (int i = 1 ; i <= 10 ; i++) {
            result += i;
        }

        System.out.println("for 문을 이용한 합 : " + result);



    }
}
