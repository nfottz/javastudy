package ex07_constructor;

public class User {
	
	// 필드
	String id;
	String pw;
	
	// 생성자
	User(){
		id = "anonymous";
		pw = "1234";
	}
	
	User(String userId, String userPw){
		id = userId;
		pw = userPw;
	}
	
	// 메소드
	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
}
