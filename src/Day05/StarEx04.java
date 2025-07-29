package Day05;

public class StarEx04 {
    public static void main(String[] args) {

        int n = 4;
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
