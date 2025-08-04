package javabagic_02.day09.methods;

public class Example02 {
    public static  String greeting(){
        String greeting = "Hello";
        return greeting;
    }

    public static void main(String[] args) {
        String greeting = greeting();
        System.out.println(greeting);
        System.out.println(greeting + "java");

        System.out.println(greeting() + "자바 프로그래밍"); // 매서드에서 메서드 호출 가능
    }
}
