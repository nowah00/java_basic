package javabasic_01.day05.StarEx;

public class StarEx05 {
    public static void main(String[] args) {

        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int l=5-i; l>=1; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
