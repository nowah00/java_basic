package Day2;

public class VaribleEx02 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int temp = 0;

        System.out.println("x = %d, y = %d, temp = d%\n", x, y, temp);


        temp = x;
        x= y;
        y = temp;

        System.out.println("x = %d, y = %d, temp = d%\n", x, y, temp);
    }
}
