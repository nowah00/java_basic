package javabagic_02.Day08.String.Loop_array;

public class JavaBagic2 {

    public static void main(String[] args) {

        int sum = 0; // 총합을 저장하는 변수

        for (int i=1; i<=100; i++){ // 1부터 100까지의 정수
            if (i%3==0){ // 정수 중 3의 배수일 때,
                sum += i; // 변수에 해당 값을 더한다.
            }
        }
        System.out.println(sum);
    }
}
