package java00_basic.homework.BoardPrj;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManger {
    private Map<String,Board> boardMap = new LinkedHashMap<>();

    //Singleton pattern 을 적용하여 어드민계정은 하나이다. 어드민 계정은 게시글 저장소를 관리한다.
    private static BoardManger boardMangerSingleTon = new BoardManger();

    private static BoardManger getInstance() {
        return boardMangerSingleTon;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }
}