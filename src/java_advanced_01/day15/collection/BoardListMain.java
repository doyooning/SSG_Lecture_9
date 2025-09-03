package java_advanced_01.day15.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        // 글 하나를 작성하여 게사판에 올립니다
        boardList.add(new Board("컬렉션 학습 첫째날", "쉽지 않네", "kdy"));

        // 현재 게시판의 글의 수
        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);

        for (Board board : boardList) {
            System.out.println("제목 : " + board.getSubject());
            System.out.println("내용 : " + board.getContent());
            System.out.println("작성자 : " + board.getWriter());
            System.out.println("-------------------------------");

            System.out.println("==========삭제==========");
            boardList.remove(2);
            Board board1 = boardList.get(2);
            System.out.println("제목 : " + board1.getSubject());
        }
    }
}
