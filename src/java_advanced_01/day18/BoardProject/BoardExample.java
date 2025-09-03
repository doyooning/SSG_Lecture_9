package java_advanced_01.day18.BoardProject;

import java.text.SimpleDateFormat;
import java.util.*;

/* 사용자가 현재 게시물 목록을 읽을 수 있다.
사용자가 메뉴를 선택하여 글 생성, 글 읽기, 삭제 가능
사용자가 게시판 프로그램을 종료 가능
*
*
* */
// 현재 게시판의 전체 게시물 목록을 출력 가능
public class BoardExample {

    private static final String menuNumberRegex = "[1-4]";
    private static final String checkNumberRegex = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int size = 1; // 공용변수
    static BoardManager boardManager;

    // BoardManager가 게시판을 관리
    public BoardExample(BoardManager boardManager) {
        this.boardManager = boardManager;
    }

    static Scanner sc = new Scanner(System.in);
    boolean flag = true;
    static Date date = new Date();
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

    public void list() {
        // 게시물 목록 출력
//        System.out.println("""
//                [게시물 목록]
//                --------------------------------------------
//                no\t\twriter\t\tdate\t\t\ttitle
//                --------------------------------------------
//                """);
        // 모든 게시물 목록 출력
        Map<String, Board> boardMap = boardManager.getBoardMap();
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s\n","no", "writer", "date", "title");
//        boards.sort(Comparator.comparingInt(Board::getBno).reversed());
//        for (Board board : boards) {
//            System.out.printf("%d\t\t%s\t\t%10s\t\t%s\n",
//                    board.getBno(), board.getBwriter(), sdf.format(board.getBdate()), board.getBtitle());
//        }
        System.out.println("-".repeat(60));
        // boardManager로부터 전체 게시물 목록 받아오기
        List<Map.Entry<String, Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4s %-20s %-20s %-20s\n",
                    value.getBno(), value.getBwriter(), sdf.format(value.getBdate()), value.getBtitle());
        });

        mainMenu();
    }

    // 게시물 메인메뉴 선택 기능
    public void run() {
        while (flag) {
            list();
        }
    }

    public void mainMenu() {
        System.out.println("-".repeat(60));
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        String input = sc.nextLine();
        if (input.equals("4")) {
            exit();
        }
        if (input.matches(menuNumberRegex)) {
            switch (input) {
                case "1" -> {
                    create();
                }
                case "2" -> {
                    read();
                }
                case "3" -> {
                    clear();
                }
            }
        } else {
            System.out.println("잘못된 접근입니다.");
        }
    }

    public static boolean checkMenu() {
        System.out.println("-".repeat(60));
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        while (true) {
            String input = sc.nextLine();
            if (input.matches(checkNumberRegex)) {
                return input.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하세요.");
            }
        }
    }

    public void create() {
        System.out.println("\n[새 게시물 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        // 게시물 제목에 입력
        System.out.print("내용: ");
        String content = sc.nextLine();
        // 게시물 내용에 입력
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        // 게시물 작성자에 입력

        // 1번 입력
        if (checkMenu()) {
            // BoardBuilder 통해서 새 게시글 생성(Builder 패턴)
            Board board = Board.builder()
                    .bno(size)
                    .bwriter(writer)
                    .btitle(title)
                    .bcontent(content)
                    .bdate(new Date())
                    .build();
            Map<String, Board> boardMap = boardManager.getBoardMap();
            boardMap.put(String.valueOf(size), board);
            boardManager.setBoardMap(boardMap);
            size++;
        }
    }

    public void read() {
        System.out.println("\n[게시물 읽기]");
        while(true) {
            try {
                System.out.print("bno: ");
                int numInput = Integer.parseInt(sc.nextLine());
                if (numInput < 0 || numInput > boardManager.getBoardMap().size()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                } else {
                    Map<String, Board> boardMap = boardManager.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board boardOne = boardMap.get(String.valueOf(numInput));
                    System.out.printf("""
                                    번호: %d
                                    제목: %s
                                    내용: %s
                                    작성자: %s
                                    날짜: %s
                                    """,
                            boardOne.getBno(), boardOne.getBtitle(), boardOne.getBcontent(), boardOne.getBwriter(), sdf.format(boardOne.getBdate()));
                    System.out.println("#".repeat(30));
                    readOption(numInput);
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void readOption(int bno) {
        System.out.println("-".repeat(60));
        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");
        while (true) {
            String input = sc.nextLine();
            if (input.matches(readOptionRegex)) {
                switch (input) {
                    case "1" -> {
                        update(bno);
                    }
                    case "2" -> {
                        delete(bno);
                    }
                    case "3" -> {
                        run();
                    }
                }
                break;
            } else {
                System.out.println("[1-3]번 중 번호를 선택하세요.");
            }
        }
    }

    public static void update(int bno) {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        String title = sc.nextLine();
        // 게시물 제목에 입력
        System.out.print("내용: ");
        String content = sc.nextLine();
        // 게시물 내용에 입력
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        // 게시물 작성자에 입력

        if (checkMenu()) {
            Map<String, Board> boardMap = boardManager.getBoardMap();
            Board boardOne = boardMap.get(String.valueOf(bno));
            boardOne.builder()
                    .btitle(title)
                    .bcontent(content)
                    .bwriter(writer)
                    .bdate(new Date())
                    .build();
            boardManager.setBoardMap(boardMap);
        }
    }

    // 예시 소스코드 참고
    public static void delete(int bno) {
        int num = 1; // 이동할 게시물 수? 라고 해야되나
        size--;
        Map<String, Board> boardMap = boardManager.getBoardMap();
        Map<String, Board> newBoardMap = new LinkedHashMap<>();
        for (Map.Entry<String, Board> entry : boardMap.entrySet()) {
            String key = entry.getKey();
            Board board = entry.getValue();
            if (key.equals(String.valueOf(bno))) { // 게시물 번호가 bno와 일치하면
                continue;
            } else if (Integer.parseInt(key) < bno) { // 게시물 번호가 bno보다 작으면
                newBoardMap.put(key, board); // 새 맵에 게시물 그대로 옮김
                num++; // num = 옮긴 게시물 + 삭제된 게시물
            } else { // 게시물 번호가 bno보다 크면
                newBoardMap.put(String.valueOf(num), board); // 삭제된 게시물부터 번호 메기기
                board.setBno(num); // 게시물에도 적용
                num++;
            }
        }
        boardManager.setBoardMap(newBoardMap); // 맵핑해준거 저장

    }

    public static void clear() {
        System.out.println("[게시물 전체 삭제]");
        if (checkMenu()) {
            boardManager.setBoardMap(new LinkedHashMap<>());
            size = 1;
        }
    }

    public void exit() {
        System.out.println("""
                
                ** 게시판 종료 **
                
                """);
        flag = false;
    }
}
