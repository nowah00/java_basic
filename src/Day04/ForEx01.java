package Day04;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ForEx01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇 번 반복할까요?");
        int n = in.nextInt();

        for (int i = 1 ; i <= n ; i++) {
            System.out.println(i + "번째");
        }
        System.out.println("종료");





    }
}
