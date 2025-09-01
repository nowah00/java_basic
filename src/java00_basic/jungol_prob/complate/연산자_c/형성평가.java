package java00_basic.jungol_prob.complate.연산자_c;

import java.util.Scanner;

public class 형성평가 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// 형성평가1
//        int k = in.nextInt();
//        int e = in.nextInt();
//        int m = in.nextInt();
//        int c = in.nextInt();
//
//        int sum = k + e + m + c;
//        int avg = (int) sum / 4;
//
//        System.out.printf("sum = %d\navg = %d", sum, avg);

// 형성평가2
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        int r1 = a / b;
//        int r2 = a % b;
//
//        System.out.printf("%d / %d = %d...%d", a, b, r1, r2);

// 형성평가3
//        int x = in.nextInt();
//        int y = in.nextInt();
//
//        int xx = x + 5;
//        int yy = y * 2;
//
//        int r = xx * yy;
//
//        System.out.printf("wirth = %d\nlength = %d\narea = %d", xx, yy, r);

// 형성평가4
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        ++a;
//        System.out.printf("%d %d\n", a, b);
//        --b;
//
//        System.out.printf("%d %d", a, b);

// 형성평가 5
        int mh = in.nextInt();
        int mw = in.nextInt();
        int gh = in.nextInt();
        int gw = in.nextInt();

        int r = (mh > gh && mw > gw) ? 1 : 0;

        System.out.println(r);
    }
}
