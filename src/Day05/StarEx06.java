package Day05;

public class StarEx06 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++) {
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2*i-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

