package ex08_this;

public class User {

	/*
	 	this
	 	1. 현재 객체의 참조값(주소)
	 	2. 클래스의 내부에서만 사용할 수 있다.
	 	3. 클래스의 구성 요소(필드, 메소드)를 호출할 때 사용할 수 있다.
	 		1) 필드	  : this.필드
	 		2) 메소드 : this.메소드()
	 */
	
	// 필드
	String id;	// this.id
	String pw;	// this.pw
	
	// 생성자
	User(String id, String pw)	{
		this.id = id;
		this.pw = pw;
	}
	// 메소드
	void printThis() {
		System.out.println(this);
	}
	void info() {
	System.out.println("아이디 : " + id);
	System.out.println("비밀번호 : " + pw);
	}
	
}
