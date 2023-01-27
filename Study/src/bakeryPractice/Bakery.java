package bakeryPractice;

import java.util.HashMap;

public class Bakery {

	private int breadCount;
	private int breadPrice;
	private int bakeryMoney;
	private HashMap<String, Object> bnc;
	
	public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		super();
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
		bnc = new HashMap<String, Object>();
	}
	
	public HashMap<String, Object> sell(int money) {
		
		int sellBread = money / breadPrice;
		int change = money % breadPrice;
		
		bnc.put("sellBread", sellBread);
		bnc.put("change", change);
		
		breadCount -= sellBread;
		bakeryMoney += (money - change);
		
		return bnc;
	}
	
	public HashMap<String, Object> getBnc() {
		return bnc;
	}

	public void setBnc(HashMap<String, Object> bnc) {
		this.bnc = bnc;
	}

	public void info() {
		
		System.out.println("남은 빵 : " + breadCount + "개");
		System.out.println("현재 돈 : " + bakeryMoney + "원");
	}	
	
}
