package practice02_Watch;

public class Watch {

	// 필드
	private int hour;  // 0 ~ 23
	private int minute;  // 0 ~ 59
	private int second;  // 0 ~ 59
	
	// 생성자
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// 메소드
	public void addHour(int hour) {
		if(hour <= 0) {
			return;
		}
		this.hour += hour;
		this.hour %= 24;  // hour를 항상 0 ~ 23의 범위로 만들어 주는 코드
	}
	
	public void addMinute(int minute) {
		if(minute <= 0) {
			return;
		}
		this.minute += minute;
		addHour(this.minute / 60);  // 몇 시간이 추가되었는지 처리하는 코드
		this.minute %= 60;  // minute을 항상 0 ~ 59의 범위로 만들어 주는 코드
	}
	
	public void addSecond(int second) {
		if(second <= 0) {
			return;
		}
		this.second += second;
		addMinute(this.second / 60);  // 몇 분이 추가되었는지 처리하는 코드
		this.second %= 60;  // second을 항상 0 ~ 59의 범위로 만들어 주는 코드
	}
	
	public void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

}