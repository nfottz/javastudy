package practice08_SmartPhone;

// 상속(extends)은 하나만 가능하지만(다중 상속 불가능),
// 구현(implements)은 여러 개가 가능하다.

// 상속과 구현을 동시에 받아도 된다.
// 상속(extends) 먼저, 구현(implements) 나중

// 전화(Phone) 기능과 컴퓨터(Computer) 기능을 모두 갖춘 스마트폰

public class SmartPhone extends Phone implements Computer {

	@Override
	public void call() {
		System.out.println("전화기능");		
	}
	
	@Override
	public void sms() {
		System.out.println("문자기능");		
	}
	
	@Override
	public void game() {
		System.out.println("게임기능");
	}
	
    @Override
    public void internet() {
    	System.out.println("인터넷기능");    	
    }
	
}
