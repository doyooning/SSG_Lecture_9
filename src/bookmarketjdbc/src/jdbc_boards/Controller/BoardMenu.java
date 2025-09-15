package jdbc_boards.Controller;

import jdbc_boards.model.BoardDAO;
import jdbc_boards.vo.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BoardMenu {
    BoardDAO dao;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    List<Board> boardList;
    String writerInfo;

    public BoardMenu() {
        dao = new BoardDAO();
        boardList = dao.dbToBoard();
    }

    public void boardMenu() throws IOException {
        boolean flag = true;
        int choice = 0;
        try {
            System.out.println("누구신가요? ");
            writerInfo = writerInput();
            System.out.printf("Welcome, %s!\n", writerInfo);
        } catch (Exception e) {
            System.out.println("다시 입력해 주세요.");
            flag = false;
            boardMenu();
        }

        while (flag) {
            try {
                System.out.println("""
                     1. 글 작성 | 2. 전체 글 보기 | 3. 선택한 글 보기 | 4. 글 수정
                     5. 글 삭제 | 6. 종료""");
                System.out.println("메뉴 선택:");
                choice = Integer.parseInt(input.readLine());
            }
            catch (IOException e){
                System.out.println("입력 에러가 발생하였습니다.");
            }catch (NumberFormatException e1){
                System.out.println("숫자만 입력해주세요.");
            }catch (Exception e2){
                System.out.println("알 수 없는 오류가 발생하였습니다.");
            }
            switch (choice) {
                case 1:
                    //사용자에게 title,content를 입력받아서 Board 구성하여 createBoard()넘겨주자
                    Board row = boardDataInput();
                    boolean ack = dao.createBoard(row);
                    if(ack == true) System.out.println("글이 성공적으로 입력되었습니다.");
                    else {
                        System.out.println("입력 실패, 다시 시도 부탁드립니다. ");
                        //원하는 위치로 이동
                    }
                    break;
                case 2:
                    // 전체 글을 읽어오기 - 입력 값 불필요
                    boardList = dao.searchAll();
                    System.out.println("-".repeat(40));
                    for (Board board : boardList) {
                        System.out.printf("%d    %s      %s      %s      %s\n",
                                board.getBno(), board.getBtitle(), board.getBcontent(), board.getBwriter(), board.getBdate());
                    }
                    System.out.println("-".repeat(40));
                    break;
                case 3:
                    // 글 번호 지정 읽어오기
                    int bno = boardNoInput();
                    Board board = dao.searchOne(bno);
                    System.out.println("-".repeat(40));
                    System.out.printf("%d    %s      %s      %s      %s\n",
                            board.getBno(), board.getBtitle(), board.getBcontent(), board.getBwriter(), board.getBdate());
                    System.out.println("-".repeat(40));
                    break;
                case 4:
                    // 글 수정
                    int num = boardNoInput();
                    row = boardDataInput();
                    row.setBno(num);
                    boolean result = dao.update(row);
                    if(result) System.out.println("성공적으로 수정되었습니다.");
                    else {
                        System.out.println("입력 실패, 다시 시도 부탁드립니다. ");
                        //원하는 위치로 이동
                    }
                    break;
                case 5:
                    // 글 삭제
                    num = boardNoInput();
                    ack = dao.delete(num);
                    if(ack == true) System.out.println("성공적으로 삭제되었습니다.");
                    else {
                        System.out.println("입력 실패, 다시 시도 부탁드립니다. ");
                        //원하는 위치로 이동
                    }
                    break;
                case 6:
                    // 종료
                    flag = false;
                    break;
            }

        }

    }

    public String writerInput() throws IOException {
        return input.readLine();
    }

    public Board boardDataInput() throws IOException{
        Board board = new Board();
        System.out.println("제목 입력");
        String title =input.readLine();
        board.setBtitle(title);
        System.out.println("내용 입력");
        String content = input.readLine();
        board.setBcontent(content);
        // writer = 접속자
        board.setBwriter(writerInfo);
        return board;
    }

    public int boardNoInput() throws IOException{
        System.out.println("글 번호 입력");
        int bno = Integer.parseInt(input.readLine());
        return bno;
    }
}
