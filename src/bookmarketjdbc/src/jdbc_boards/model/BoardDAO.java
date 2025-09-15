package jdbc_boards.model;

import jdbc_boards.util.DBUtil;
import jdbc_boards.vo.Board;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDAO {
    private Connection conn;
    List<Board> boardList = new ArrayList<Board>();

    public List<Board> dbToBoard() {
        conn = DBUtil.getConnection();
        String sql = "SELECT * FROM boardtable";
        try(PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt(1));
                board.setBtitle(rs.getString(2));
                board.setBcontent(rs.getString(3));
                board.setBwriter(rs.getString(4));
                board.setBdate(rs.getTimestamp(5));
                boardList.add(board);
            }
            return boardList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 글 등록 기능
    public boolean createBoard(Board board) {
        // 1. Connection 필요
        conn = DBUtil.getConnection();

        // 2. 쿼리 생성
        String sql = "insert into boardtable(btitle, bcontent, bwriter, bdate) values (?, ?, ?, now()) ";

        // 3. Connection 쿼리를 담아 DB서버로 request할 객체 PrepareStatement 생성
        try(PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // 4. 값 세팅
            pstmt.setString(1, board.getBtitle());
            pstmt.setString(2, board.getBcontent());
            pstmt.setString(3, board.getBwriter());

            // 5. 서버로 전송
            int result = pstmt.executeUpdate();
            boolean ok = result > 0;

            try(ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int newbno = rs.getInt(1);
                    board.setBno(newbno);
                    boardList.add(board);
                }
            }
            // 6. 서버로 전송 후 결과값
            return ok;

        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
    }

    // 글 수정 기능
    public boolean update(Board board) {

        // 1. Connection 필요
        conn = DBUtil.getConnection();

        // 2. 쿼리 생성
        String sql = "update boardtable set btitle = ?, bcontent = ? where bno = ?";

        // 3. Connection 쿼리를 담아 DB서버로 request할 객체 PrepareStatement 생성
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 4. 값 세팅
            pstmt.setString(1, board.getBtitle());
            pstmt.setString(2, board.getBcontent());
            pstmt.setInt(3, board.getBno());

            // 5. 서버로 전송
            int result = pstmt.executeUpdate();
            boolean ok = result > 0;

            for (Board b : boardList) {
                if (b.getBno() == board.getBno()) {
                    b.setBtitle(board.getBtitle());
                    b.setBcontent(board.getBcontent());
                    return ok;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 전체 글 읽어오기 기능
    public List<Board> searchAll() {
        boardList = new ArrayList<Board>();

        // 1. Connection 필요
        conn = DBUtil.getConnection();

        // 2. 쿼리 생성
        String sql = "select * from boardtable order by bno desc";

        // 3. Connection 쿼리를 담아 DB서버로 request할 객체 PrepareStatement 생성
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            // 4. 값 세팅

            while (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt(1));
                board.setBtitle(rs.getString(2));
                board.setBcontent(rs.getString(3));
                board.setBwriter(rs.getString(4));
                board.setBdate(rs.getTimestamp(5));
                boardList.add(board);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 5. 서버로 전송
        return boardList;
    }

    // 글 삭제 기능
    public boolean delete(int bno) {

        // 1. Connection 필요
        conn = DBUtil.getConnection();

        // 2. 쿼리 생성
        String sql = "delete from boardtable where bno = ?";

        // 3. Connection 쿼리를 담아 DB서버로 request할 객체 PrepareStatement 생성
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 4. 값 세팅
            pstmt.setInt(1, bno);

            // 5. 서버로 전송
            int result = pstmt.executeUpdate();

            for (Board b : boardList) {
                if (b.getBno() == bno) {
                    boardList.remove(b);
                    return result > 0;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

       return false;
    }

    // 글 번호로 읽어오기 기능
    public Board searchOne(int bno) {

        // 1. Connection 필요
        conn = DBUtil.getConnection();

        // 2. 쿼리 생성
        String sql = "select * from boardtable where bno = ?";

        // 3. Connection 쿼리를 담아 DB서버로 request할 객체 PrepareStatement 생성
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 4. 값 세팅
            pstmt.setInt(1, bno);
            try(ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Board board = new Board();
                    board.setBno(rs.getInt(1));
                    board.setBtitle(rs.getString(2));
                    board.setBcontent(rs.getString(3));
                    board.setBwriter(rs.getString(4));
                    board.setBdate(rs.getTimestamp(5));
                    return board;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 5. 서버로 전송

        return null;
    }


}
