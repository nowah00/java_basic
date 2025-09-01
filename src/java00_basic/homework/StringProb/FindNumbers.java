package java00_basic.homework.StringProb;

public class FindNumbers {

    public static void main(String[] args) {
        FindNumbers fn=new FindNumbers();

        long number = 228754462;
        System.out.println( "입력 숫자 = " + number );
        System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
        System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
    }

    public static int countNumber(long number, int i){
        int count = 0;
        while (number > 0) {
            long d = number % 10;
            if (d == i) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
