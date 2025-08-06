package javabasic_02.day07;

public class BookExam {
    public static void main(String[] args) {
        Book 신 = new Book();
        신.title = "신";
        신.company = "열린책들";
        신.author = "베르나르 베르베르";
        신.price = 13500;

        System.out.println(신.title);
        System.out.println(신.company);
        System.out.println(신.author);
        System.out.println(신.price);
    }
}
