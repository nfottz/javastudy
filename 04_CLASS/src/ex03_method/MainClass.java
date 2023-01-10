package ex03_method;

public class MainClass {

	public static void ex01() {
		
		// Calculator 객체 선언 + 생성
		Calculator calc = new Calculator();
		
		double add = calc.addition(1.5, 2.5);	// addition 메소드 호출
		System.out.println(add);
		
		double sub = calc.subtraction(2.5, 1.3);
		System.out.println(sub);
		
	}
	
	public static void ex02() {
		
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		
		CoffeeAndChange coffeeAndChange = coffeeMachine.buyCoffee(1000, 1);
		System.out.println(coffeeAndChange.coffee);
		System.out.println(coffeeAndChange.change);
		
		System.out.println(coffeeMachine.moneyPot);
		
	}
	public static void main(String[] args) {
		ex02();
	}

}
