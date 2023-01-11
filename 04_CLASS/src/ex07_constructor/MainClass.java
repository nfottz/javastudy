package ex07_constructor;

public class MainClass {

	public static void ex01() {
		
		// User 객체 생성(User() 생성자 호출)
		User user1 = new User();
		
		// user1의 info 메소드 호출
		user1.info();
		
		// User 객체 생성(User(String userId, String userPw) 생성자 호출)
		User user2 = new User("admin", "123456");
		
		// user2의 info 메소드 호출
		user2.info();
		
	}
	
	public static void ex02() {
		
		Book book1 = new Book("좋은세상");
		book1.info();	// 제목 : 좋은세상, 저자 : 미상, 가격 : 0원
		
		Book book2 = new Book("홍길동전", "허균");
		book2.info();	// 제목 : 홍길동전, 저자 : 허균, 가격 : 0원
		
		Book book3 = new Book("소나기", "황순원", 10000);
		book3.info();	// 제목 : 소나기, 저자 : 황순원, 가격 : 10000원
	}
	
	public static void main(String[] args) {
		ex02();
	}
}
