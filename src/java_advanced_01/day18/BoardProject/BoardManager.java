package java_advanced_01.day18.BoardProject;

import java.util.LinkedHashMap;
import java.util.Map;

// 게시판 관리를 위한 관리자
public class BoardManager {
    private Map<String, Board> boardMap = new LinkedHashMap<>();

    // Singleton 패턴으로 인스턴스는 관리자 계정으로 하나만 생성
    private static final BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance() {
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }
}
