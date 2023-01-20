package practice02_Bus;

// 버스 좌석 1개

public class Seat {

	// 필드
	private Person person;  // Person, Student 모두 좌석에 앉을 수 있음
	
	// 생성자
	public Seat() {
		// 하는 일 없음
	}

	// 메소드
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
