package practice09_Eatable;

public class MainClass {
	
	public static void main(String[] args) {

		Person p = new Person("제시카");
		
		p.setCalorie(300);
		p.info();  // 제시카는 현재 300kcal입니다.
		
		p.eat(new Apple("청송사과", 200));  // 청송사과 200kcal를 먹습니다.
		p.info();  // 제시카는 현재 500kcal입니다.

		// p.eat(new Burger("빅맥", 1000));  // 오류 발생(Burger는 먹을 수 없는 것으로 정의해 두었음)
		
	}
	
}
