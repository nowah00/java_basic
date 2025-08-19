package java_advanced_01.day17.yeasterdayProb.comparable;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        User1 박희동 = new User1("박희동", 14);
        User1 홍길동 = new User1("홍길동", 32);
        User1 김동성 = new User1("김동성", 48);
        User1 김유신 = new User1("김유신", 64);

        TreeSet<User1> treeSet = new TreeSet<>();
        treeSet.add(박희동);
        treeSet.add(홍길동);
        treeSet.add(김동성);
        treeSet.add(김유신);

        for (User1 u : treeSet) {
            System.out.print(u.name + " ");
        }
    }


}
