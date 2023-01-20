package practice06_Person_Array;

public class Person {

	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Person() {}  // new Person()
	public Person(String name, int age) {  // new Person("alice", 20)
		this.name = name;
		this.age = age;
	}

	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
