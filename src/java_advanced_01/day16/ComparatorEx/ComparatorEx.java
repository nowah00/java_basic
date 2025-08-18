package java_advanced_01.day16.ComparatorEx;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        //과일가게에서 과일을 관리할 때의 기준 (FruitComparator) 으로 정렬하여 관리 하겠다.

        TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator());
        fruits.add(new Fruit("Apple", 10));
        fruits.add(new Fruit("Banana", 5));
        fruits.add(new Fruit("Orange", 20));

        for (Fruit fruit : fruits) System.out.println(fruit.name + " " + fruit.price);
    }
}
