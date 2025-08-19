package java_advanced.day17.yeasterdayProb.comparable;

public class User1 implements Comparable<User1> {
    public String name;
    public int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User1 o) {
        if (this.age < o.age) {
            return 1;
        } else if (this.age > o.age) {
            return -1;
        } else {return 0;}
    }
}
