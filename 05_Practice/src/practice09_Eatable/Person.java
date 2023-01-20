package practice09_Eatable;

public class Person {
	
	// field
	private int calorie;
	private String name;
	
	// constructor
	public Person(String name) {
		super();
		this.name = name;
	}
	
	// method
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// public void eat(Food food) { } // new Apple, new Burger 모두 가능하다.
	public void eat(Eatable food) {  // Eatable 인터페이스 구현 클래스만 가능하다.
		((Food)food).eat();
		setCalorie(this.calorie + ((Food)food).getFoodCalorie());  // 현재 칼로리 + food 칼로리
	}
	public void info() {
		System.out.println(name + "는 현재 " + calorie + "kcal입니다.");
	}
	
}
