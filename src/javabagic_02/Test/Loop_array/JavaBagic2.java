package javabagic_02.Test.Loop_array;

public class JavaBagic2 {

    public static void main(String[] args) {

        int total = 0;

        for (int i=1; i<=100; i++){
            if (i%3==0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
