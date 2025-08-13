package java_advanced_01.day15.generic;

import java.util.ArrayList;

public class BoxModelMain {

    public static void main(String[] args) {
        //로켓 프레쉬 라인, 철호가 "배추", "무", "상추", "삼겹살" 구매하였다.
        //담아서 box 에 담고 담긴 내용을 출력하세요.
        BoxModel<String> box = new BoxModel<>();
        box.content = new String[] {"배추", "무", "상추", "삼겹살"};

        for (String s : box.content) {
            System.out.println(s);
        }
    }
}
