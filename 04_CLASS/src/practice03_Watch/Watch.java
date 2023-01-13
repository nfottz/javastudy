package practice03_Watch;

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
		int maxHour = 23;
		int temHour = this.hour + hour;
		
		while(temHour > maxHour) {
			temHour -= (maxHour + 1);
		}
		
		this.hour = temHour;
	}
	
	public void addMinute(int minute) {
		int maxMin = 59;
		int temMin = this.minute + minute;
		
		int n =0;
		while(temMin > maxMin) {
			temMin -= (maxMin + 1);
			n++;
		}
		
		hour += n;
		this.minute = temMin;
	}
	
	public void addSecond(int second) {
		int maxSec1 = 3599;
		int maxSec2 = 59;
		int temSec = this.second + second;
		
		int n = 0;
		while (temSec > maxSec1) {
			temSec -= (maxSec1 + 1);
			n++;
		}
		
		int m = 0;
		while (temSec > maxSec2) {
			temSec -= (maxSec2 + 1);
			m++;
		}
		
		hour += n;
		minute += m;
		this.second = temSec;
	}
	
	public void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
}