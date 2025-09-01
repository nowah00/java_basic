package java00_basic.homework.BoardPrj;

public class BoardMain {
    public static void main(String[] args) {
        BoardManger boardManger = new BoardManger(); //관리자 생성
        BoardExample board = new BoardExample(boardManger); //관리자(생성자) 주입
        board.run();
    }
}
