package java_advanced.day18;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    //제품은 제품번호, 제품이름, 제조사, 가격이란 속성을 가지고 있다.
    public String no;
    public String name;
    public String company;
    public Integer price;
}
