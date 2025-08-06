package javabasic_02.day11.inheritane.practice1;

public class Inheritance extends Calculation{

    void multiplication(int n1, int n2){
        int result = n1 * n2;
        System.out.println("두 수의 곱셈: " + result);
    }


//    public static void main(String[] args) {
//
//        Inheritance obj = new Inheritance();
//
//        obj.addition(20,10);
//        obj.subtraction(20,10);
//        obj.multiplication(20,10);
//
//    }
}
