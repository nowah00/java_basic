package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_자가진단1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int total =0;
        int count = 0;

        for(int i=1; i<=n; i++) {
            if (i%2!=0){
                total += i;
                count++;
            }
            if (total>=n){
                break;
            }
        }
        System.out.print(count + " " + total);
    }
}