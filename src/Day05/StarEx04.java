package Day05;

import java.util.Scanner;

public class StarEx04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = n;

        for (int i=1; i<=n; i++) {
            for (int j = k; j >= 1; j--) {
                System.out.print("*");
            }
            k--;
            System.out.println();
        }
    }
}
