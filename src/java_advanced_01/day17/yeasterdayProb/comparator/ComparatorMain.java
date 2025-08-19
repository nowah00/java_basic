package java_advanced_01.day17.yeasterdayProb.comparator;

import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {

        TreeSet<User2> users = new TreeSet<>(new UserComparator());
        users.add(new User2("박희동", 14));
        users.add(new User2("홍길동", 32));
        users.add(new User2("김동성", 48));
        users.add(new User2("김유신", 64));

        for (User2 user : users) {
            System.out.print(user.name + " ");
        }
    }
}
