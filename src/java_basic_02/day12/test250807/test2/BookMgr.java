package java_basic_02.day12.test250807.test2;

import java.util.Arrays;

public class BookMgr {
	Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBooklist(){
        for (Book book : booklist) {
            System.out.println(book.getTitle());
        }
	}
	
	public void printTotalPrice(){
		int sum = Arrays.stream(booklist).mapToInt(Book::getPrice).sum();
        System.out.println("전체 책 가격의 합 : " + sum);
	}
}
