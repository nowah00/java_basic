package java_advanced.day17.AnonymousCLass.class5;

public interface Operate {
    //추상 메소드
    int operate(int a, int b);
    //default 메소드
    default void print() {
        System.out.println("print");
    }
}
