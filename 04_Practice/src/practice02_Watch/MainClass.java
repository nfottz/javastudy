package practice02_Watch;

public class MainClass {

	public static void main(String[] args) {
		
		Watch watch = new Watch(16, 15, 30);  // 16시 15분 30초
		
		watch.addHour(25);  	// 25시간 후(1시간)
		watch.addMinute(61);	// 61분 후 	(1시간 1분)
		watch.addSecond(3661);	// 3661초 후(1시간 1분 1초)
		
		watch.see();  // 19시 17분 31초

	}

}
