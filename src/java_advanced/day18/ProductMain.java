package java_advanced.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {

    public static void main(String[] args) {
        //List<Product> products 생성 ArrayList products 생성
        List<Product> products = new ArrayList<>();
        products.add(new Product("1","하리보1","젤리",2000));
        products.add(new Product("2","하리보2","젤리",2100));
        products.add(new Product("3","하리보3","젤리",2200));
        products.add(new Product("4","하리보4","젤리",2300));
        products.add(new Product("5","하리보5","젤리",2400));

        Stream<Product> jelly = products.stream();
        jelly.forEach(System.out::println);
    }
}
