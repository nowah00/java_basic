package java_basic.jungol_prob.complate.반복제어문3_c;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {

        int a = 97;
        int b = 1;

        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char)a + " ");
                a++;
            }
            for (int k=1; k<=5-i; k++){
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}

