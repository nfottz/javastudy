package practice;

import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainClass {

	// 문제1. 현재 시간을 이용하여 디렉터리를 생성하시오.
	// 예시)
	// C:\14\31\30
	
	public static void ex01() {
	
		LocalTime now = LocalTime.now();
		int hour = now.getHour();
		int min = now.getMinute();
		int sec = now.getSecond();

		String sep = File.separator;
		File dir = new File("C:" + sep + hour + sep + min + sep + sec);

		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	
	public static void main(String[] args) {
		ex01();
	}
	
}
