package java_advanced_01.assignment;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> BoardList = new ArrayList<>();

    public BoardDao() {
        for (int i = 0; i < 3; i++) {
            BoardList.add(new Board(String.format("제목%d", i + 1),
                    String.format("내용%d", i + 1)));
        }
    }

    public List<Board> getBoardList() {
        return BoardList;
    }
}
