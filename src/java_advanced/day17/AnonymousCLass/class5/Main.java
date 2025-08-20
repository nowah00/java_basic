package java_advanced.day17.AnonymousCLass.class5;

public class Main {

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;

        Calculator calculator = new Calculator(num1, num2);

        Operate operate1 = (n1, n2) -> n1+n2;

        int result1 = calculator.calculate(operate1);

        System.out.println(result1);

        Operate operate2 = (n1, n2) -> n1-n2;

        int result2 = calculator.calculate(operate2);

        System.out.println(result2);
    }
}
