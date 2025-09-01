package java01_interface.InheritanceProb2;

public class prob2 {
    public static void main(String[] args) {
        Book[] bookList = new Book[5];
        Book book1 = new Book("Java Program", 25000);
        Book book2 = new Book("JSP Program", 15000);
        Book book3 = new Book("SQL Fundamentals", 30000);
        Book book4 = new Book("JDBC Program", 28000);
        Book book5 = new Book();
        book5.setTitle("EJB Program");
        book5.setPrice(34000);
        bookList[0] = book1;
        bookList[1] = book2;
        bookList[2] = book3;
        bookList[3] = book4;
        bookList[4] = book5;

        BookMgr mgr = new BookMgr(bookList);
        System.out.println("=== 책 목록 ===");
        mgr.printBooklist();
        System.out.println("");
        System.out.println("=== 책 가격의 총합 ===");
        mgr.printTotalPrice();
    }
}
