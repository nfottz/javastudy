package ex01_generic;

public class MainClass {

	public static void main(String[] args) {
		
		// Generic 처리할 때는 "항상" 참조 자료형을 전달해야 한다.
		
		Box<Integer> box1 = new Box<Integer>();
		box1.setItem(10);
		System.out.println(box1.getItem());
		
		// JDK 1.7 이후로 생성자에는 자료형을 생략할 수 있다.
		Box<String> box2 = new Box<>();
		box2.setItem("hello");
		System.out.println(box2.getItem());
		
	}
	
}
