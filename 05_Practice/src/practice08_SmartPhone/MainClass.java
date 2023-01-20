package practice08_SmartPhone;

public class MainClass {

	public static void main(String[] args) {
		
		// Phone 타입이면 Computer가 안 보이므로 Computer로 캐스팅 필요
		Phone p1 = new SmartPhone();
		p1.call();
		p1.sms();
		((Computer) p1).game();
		((Computer) p1).internet();
		
		// Computer 타입이면 Phone이 안 보이므로 Phone으로 캐스팅 필요
		Computer p2 = new SmartPhone();
		((Phone) p2).call();
		((Phone) p2).sms();
		p2.game();
		p2.internet();
		
		// SmartPhone은 모두 보임
		SmartPhone p3 = new SmartPhone();
		p3.call();
		p3.sms();
		p3.game();
		p3.internet();

	}

}
