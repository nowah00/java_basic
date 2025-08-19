package java_advanced.day17.yeasterdayProb.comparator;

import java.util.Comparator;

public class UserComparator implements Comparator<User2> {

    @Override
    public int compare(User2 o1, User2 o2) {
        if (o1.age == o2.age) return 0;
        else if (o1.age < o2.age) return 1;
        else return -1;
    }
}
