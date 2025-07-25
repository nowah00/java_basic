package Day03;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("상품의 가격: %d \n", 5000);
        System.out.printf("상품의 가격: %7d \n", 5000);
        System.out.printf("상품의 가격: %06d \n", 5000);

        System.out.println("반지름을 입력하세요");
        int x = in.nextInt();
        float result = x * x * 3.14f;

        System.out.printf("%.1f", result);
    }
}
