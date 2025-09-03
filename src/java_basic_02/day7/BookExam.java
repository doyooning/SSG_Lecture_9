package java_basic_02.day7;

public class BookExam {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.price = 10000;
        book1.title = "자바의 정석";
        book1.company = "KK";
        book1.isbn = "123456";
        book1.author = "남궁성";
        book1.page = 500;

        System.out.printf("\"%s\"의 저자는 %s이며, 가격은 %d원입니다.", book1.title, book1.author, book1.price);
    }
}
