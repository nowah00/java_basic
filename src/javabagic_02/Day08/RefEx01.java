package javabagic_02.Day08;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바");
        refVar2 = "프로그래밍";
        String refVar3 = "자바";
        String refVar4 = null;

        System.out.println(refVar1 == refVar2);
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        System.out.println("----------------------------");
        System.out.println(refVar1.equals(refVar2));
        System.out.println(refVar2.equals(refVar3));

        System.out.println("--------NullPointException");
        System.out.println(refVar4);
        System.out.println(refVar4.length());


    }
}
