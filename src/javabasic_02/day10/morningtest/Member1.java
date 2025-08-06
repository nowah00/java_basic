package javabasic_02.day10.morningtest;

public class Member1 {
        String name;
        String id;
        String password;
        int age;

        Member1(){}; // default 생성자를 꼭 만들어주기!
        Member1(String name, String id){
                this.name = name;
                this.id = id;
        };


        public static void main(String[] args) {
                Member1 user1 = new Member1();
                System.out.println(user1.toString());
                System.out.println(user1.name);
                System.out.println(user1.age);
                System.out.println(user1.id);
                System.out.println(user1.password);

                Member1 user2 = new Member1("홍길동", "honghonghong");

                System.out.println(user2.toString());
                System.out.println(user2.name);
                System.out.println(user2.age);
                System.out.println(user2.id);
                System.out.println(user2.password);
        }
}