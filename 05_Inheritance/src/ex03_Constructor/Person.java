package ex03_Constructor;

public class Person {

	// 생성자
	public Person() {
		System.out.println("Person 생성");
	}
	
	/*************************************/
	
	// 필드
	private String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
	}

	// 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
