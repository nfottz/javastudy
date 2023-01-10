package ex01_field;

public class User {

	/*
	 	필드
	 	1. 클래스가 가지는 변수 (cf. 메소드가 가지는 것 - 변수)
	 	2. 일반 변수와 달리 자동으로 초기화된다.
	 */
	
	String id;		// null -> 클래스의 초기화값이 null
	String pw;		// null
	int point;		// 0
	boolean isVip;	// false
	
	Address addr;
//	Address addr = new Address(); 하면 MainClass에서 따로 해줄 필요없음
}
