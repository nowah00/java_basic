package javabasic_02.day07;

public class Fitness {
    public static void main(String[] args) {
        Member ss_health01 = new Member();

        ss_health01.name = "홍길동";
        ss_health01.age = 30;
        ss_health01.phoneNumber = "010 1111 1111";
        ss_health01.email = "fc@naver.com";
        ss_health01.address = "서울";
        ss_health01.weight = 57.6;

        Member ss_health02 = new Member();

        ss_health01.name = "고하원";
        ss_health01.age = 26;
        ss_health01.phoneNumber = "010 2775 9804";
        ss_health01.email = "hw@naver.com";
        ss_health01.address = "제주";
        ss_health01.weight = 68.6;

        Member[] 삼성 = new Member[2];
        삼성[0] = ss_health01;
        삼성[1] = ss_health02;

        System.out.println(ss_health01.name);
        System.out.println(ss_health01.age);
        System.out.println(ss_health01.phoneNumber);
        System.out.println(ss_health01.email);
        System.out.println(ss_health01.address);
        System.out.println(ss_health01.weight);
    }
}
