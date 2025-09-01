package java_basic.jungol_prob.complate.배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_행복 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("학생의 수를 입력하시오.");
        int student = in.nextInt();
        int[] arr = new int[student]; // 학생의 수를 입력

        int sum = 0;

        System.out.println("학생 수에 알맞게 점수를 입력하시오.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // 학생 수에 알맞게 점수를 입력
        }

        Arrays.sort(arr); // 오름차순 정렬

        sum = arr[student-1] - arr[0]; // 오름차순으로 정렬했기에 가장 마지막 값과 처음 값을 빼면 큰 값과 작은 값을 뺴게 됌.

        System.out.printf("가장 높은 점수와 가장 낮은 점수의 차이 : %d", sum);
    }
}
