package java_advanced_01.day18.BoardProject;

public class BoardMain {

    public static void main(String[] args) {
        // 생성자 인젝션
        BoardManager boardManager = new BoardManager();
        BoardExample boardEx = new BoardExample(boardManager);
        boardEx.run();
    }
}
