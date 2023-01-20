package practice02_Bus;

public class MainClass {

	public static void main(String[] args) {
		
		Bus bus = new Bus(10);  // 10인승 버스(좌석번호는 1부터 10까지 부여)
		
		bus.riding(1, new Person("홍길동"));  // 1번 좌석에 홍길동 앉음
		bus.riding(1, new Person("도깨비"));  // 1번 좌석에 도깨비 앉음(이미 앉아 있으므로 아무 일도 없어야 함)
		bus.riding(3, new Student("김두한")); // 3번 좌석에 김두한 앉음
		bus.riding(11, new Person("공유"));   // 11번 좌석에 공유 앉음(잘못된 입력이므로 아무 일도 없어야 함)
		
		bus.info();

	}

}
