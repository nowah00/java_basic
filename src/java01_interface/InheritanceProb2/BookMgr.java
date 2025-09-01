package java01_interface.InheritanceProb2;

public class BookMgr {
    private Book[] bl = new Book[5];
    private int sum = 0;

    public BookMgr(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
          bl[i] = bookList[i];
        }
    }

    public void printBooklist(){
        for (int i = 0; i < bl.length; i++) {
            System.out.println(bl[i].getTitle());
        }
    }

    public void printTotalPrice(){
        for (int i = 0; i < bl.length; i++) {
            sum += bl[i].getPrice();
        }
        System.out.println("전체 책 가격의 합 : " + sum);
    }
}
