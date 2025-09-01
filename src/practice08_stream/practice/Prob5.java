package practice08_stream.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) {
        String fileName = "/Users/hawon/Documents/study/Temp/order.dat";

        Product jelly = new Product("마이구미",1000);
        Product cookie = new Product("촉촉한 초코칩",2500);

        List<Order> orders = Arrays.asList(
                new Order("하원", jelly),
                new Order("예림", cookie)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            for (Order order : orders) {
                oos.writeObject(order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
//            List<Order> orderList = (List<Order>) ois.readObject();
//            for (Order order : orderList) {
//                Product product = order.getProduct();
//                System.out.println("주문자: " + order.getOrderId());
//                System.out.println("상품: " + product.getName());
//                System.out.println("가격: " + product.getPrice());
//                System.out.println();
//            }
            Order order = (Order) ois.readObject();
            Product product = order.getProduct();
                System.out.println("주문자: " + order.getOrderId());
                System.out.println("상품: " + product.getName());
                System.out.println("가격: " + product.getPrice());
                System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
