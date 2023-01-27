package bakeryPractice;

public class Customer {

	private int breadCount;
	private int money;
	
	public Customer(int money) {
		this.money = money;
	}
	
	public void buy(Bakery bakery, int money) {
		this.money -= money;
		this.breadCount += (int)bakery.getBnc().get("sellBread");
		this.money += (int)bakery.getBnc().get("change");
	}
	
	public void info() {
		System.out.println("구매한 빵 : " + breadCount + "개");
		System.out.println("남은 돈 : " + money);
	}
	
}
