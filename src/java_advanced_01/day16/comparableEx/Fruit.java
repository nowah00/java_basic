package java_advanced_01.day16.comparableEx;

import java.util.TreeSet;

//과일이 있다. 과일을 가격기준으로 오름차순으로 정렬할 수 있도록 비교기를 구현하라
public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override // 비교기
    public int compareTo(Fruit o) {
        if (this.price < o.price) {
            return 1;
        } else if (this.price > o.price) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit("사과", 10000);
        Fruit f2 = new Fruit("포도", 18000);
        Fruit f3 = new Fruit("귤", 12000);
        Fruit f4 = new Fruit("복숭아", 8000);


        TreeSet<Fruit> 총각네과일가게 = new TreeSet<Fruit>();
        총각네과일가게.add(f1);
        총각네과일가게.add(f2);
        총각네과일가게.add(f3);
        총각네과일가게.add(f4);

        for (Fruit f : 총각네과일가게) {
            System.out.println(f.name + "  " + f.price + "원");
        }
    }
}
