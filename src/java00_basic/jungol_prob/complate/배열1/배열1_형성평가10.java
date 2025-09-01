package java00_basic.jungol_prob.complate.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_형성평가10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("20명 이하의 인원 입력하시오.");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("점수를 입력하세요.");
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }

    }
}
