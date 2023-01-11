package ex07_constructor;

public class Book {

	// 필드
	String title;
	String author;
	int price;
	
	// 생성자
	Book(String bookTitle){
		title = bookTitle;
		author = "미상";
		}
		
	Book(String bookTitle, String bookAuthor){
		title = bookTitle;
		author = bookAuthor;
	}
	
	Book(String bookTitle, String bookAuthor, int bookPrice){
		title = bookTitle;
		author = bookAuthor;
		price = bookPrice;	
	}
	
	// 메소드
	void info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
		System.out.println();
	}
}
