package java_basic_02.welcomeProject;

public class BookList {
    // 도서 개수, 도서 정보 개수 = 상수
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    String[][] book = new String[NUM_BOOK][NUM_ITEM];

    public BookList() {
        book[0][0] = "ISBN1235";
        book[0][1] = "안드로이드 프로그래밍";
        book[0][2] = "33000";
        book[0][3] = "우재남";
        book[0][4] = "실습 단계별 명쾌한 멘토링!";
        book[0][5] = "IT전문서";
        book[0][6] = "2022/01/22";

        book[1][0] = "ISBN1236";
        book[1][1] = "스크래치";
        book[1][2] = "22000";
        book[1][3] = "고광일";
        book[1][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[1][5] = "컴퓨터입문";
        book[1][6] = "2019/06/10";

        book[2][0] = "ISBN1234";
        book[2][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[2][2] = "27000";
        book[2][3] = "송미영";
        book[2][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[2][5] = "IT전문서";
        book[2][6] = "2018/10/08";
    }
}
