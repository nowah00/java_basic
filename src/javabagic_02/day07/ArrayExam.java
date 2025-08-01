package javabagic_02.day07;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A','P','P','L','E'};

        char char1 = 'a';
        char1 = 65;
        System.out.println((char)char1);

        c[0] = 65;
        c[1] = 80;
        c[2] = 80;
        c[3] = 76;
        c[4] = 69;

        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            System.out.println(c1);

        }

        char1 = Character.toUpperCase('a');
        System.out.println(char1);

    }
}
