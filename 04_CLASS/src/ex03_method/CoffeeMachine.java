package ex03_method;

public class CoffeeMachine {

	// 필드
	int moneyPot;	//초기값 0
	String[] menu = {"아메리카노", "카페라떼", "마끼아또"};
	int[] prices = {900, 1500, 2000};
	
	// 메소드
	CoffeeAndChange buyCoffee(int money, int choice){

		String coffee = menu[choice -1];
		int price = prices[choice - 1];

		moneyPot += price;
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee;
		cnc.change = money - price;
		return cnc;
		
	}
	
}
