package jungol.complate.배열1;

public class 배열1_연습문제02 {
    public static void main(String[] args) {

        int [] array = new int [26];
        int a = 65;

        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a++;
        }
        for (int i = 25; i >= 0 ; i--) {
            System.out.print((char)array[i] + " ");
        }
    }
}
