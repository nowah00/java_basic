package java_advanced.day19.test;

public class Test03 {
    int i;
    Integer iI;

    public void sayHello() {
        System.out.println("Say Hello");
    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
//        iI = 10;
        System.out.println(test03.i);
        System.out.println(test03.iI);

        test03.sayHello();
        sayHi(); // -> 클래스의 정적(static)멤버는 각각의 인스턴스 아닌 클래스에 속하기 떄문에 컴파일 타임에 JVM 의 static 영역에 최적화 되어 저장된다.
    }
}
