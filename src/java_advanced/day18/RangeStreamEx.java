package java_advanced.day18;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeStreamEx {
    public static int sum1 = 0;
    public static int sum2 = 0;
    public static void main(String[] args) {

        IntStream i1_100 = IntStream.rangeClosed(1, 100);
        i1_100.forEach(number -> sum1 += number);
        System.out.print(sum1);

        System.out.println();

        IntStream i1_10 = IntStream.range(1, 100);
        i1_10.forEach(number -> sum2 += number);
        System.out.print(sum2);
    }
}
