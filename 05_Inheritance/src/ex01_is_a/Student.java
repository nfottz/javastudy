package ex01_is_a;

/*
 	자식 클래스
 	1. 서브(sub) 클래스라고 한다.
 	2. 부모 클래스의 기능을 자기 것처럼 사용할 수 있다.
 */

public class Student extends Person {

	public void study() {
		System.out.println("공부한다.");
	}
	
}
