package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

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

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            Order order = new Order("하원", jelly);
            oos.writeObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Order order = (Order) ois.readObject();
            Product product = order.getProduct();
            System.out.println("주문자: " + order.getOrderId() + "\n상품: " + product.getName() + "\n가격: " + product.getPrice());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
