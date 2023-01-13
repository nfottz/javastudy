package practice03_Bus;

// 버스

public class Bus {

	// 필드
	private Seat[] seats;        // 여러 좌석이 있음
	private int passengerLimit;  // 버스 정원
	
	// 생성자
	public Bus(int passengerLimit) {  // new Bus(25)인 경우 25인승 버스를 의미함
		
	}
	
	// 승차 메소드
	public void riding(int seatNo, Person person) {  // riding(1, new Person("홍길동")) : 1번 좌석에 앉은 홍길동
		
	}
	
	// 승차 현황 메소드
	public void info() {
		// 1번 좌석 : 홍길동
		// 2번 좌석 : 비어있음
		// ...
		
	}
	
}