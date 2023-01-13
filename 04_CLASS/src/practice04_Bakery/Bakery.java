package practice04_Bakery;

// 한 가지 종류의 빵만 판매하는 빵집

public class Bakery {

	// 필드
	private int breadCount;  // 판매하는 빵의 개수
	private int breadPrice;  // 판매하는 빵의 가격
	private int bakeryMoney; // 빵집에 있는 돈

	// 생성자
	public Bakery() { }
	
	public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
	}

	// 판매 메소드
	// 구매자에게 돈을 받는다. 구매자에게 빵과 잔돈을 준다.
	public BreadAndChange sell(int money) {

		int n = 0;
		while(money >= breadPrice) {
			breadCount --;
			n++;
		}
		
		int change = money - breadPrice * n;
		bakeryMoney += breadPrice * n;
		
		BreadAndChange bac = new BreadAndChange(breadCount, change);
		
		return bac;
	}
	
	
	// 판매 현황 메소드
	public void info() {
		System.out.println("남은 빵 : " + breadCount + "개");
		System.out.println("현재 돈 : " + bakeryMoney + "원");
	}
	
	
}