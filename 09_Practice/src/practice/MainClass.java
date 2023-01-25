package practice;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
	
	// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 출력하시오.
	/*
	2023-01-04  오후 02:19    <DIR>          bin
	2023-01-04  오후 02:19    <DIR>          conf
	2023-01-04  오후 02:19    <DIR>          include
	2023-01-04  오후 02:19    <DIR>          jmods
	2023-01-04  오후 02:19    <DIR>          legal
	2023-01-04  오후 02:19    <DIR>          lib
	2023-01-04  오후 02:19               160 README.html
	2023-01-04  오후 02:19             1,302 release
	               2개 파일               1,462 바이트
	*/
	public static void ex02() {	
		String spr = File.separator;
		File dir = new File("C:" + spr + "Program Files" + spr + "Java" + spr + "jdk-11.0.17");
		File[] files = dir.listFiles();
		
		int count = 0;
		int totalSize = 0;
		
		for(int i = 0; i < files.length; i++) {
			
			String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(files[i].lastModified());
			String classify = "";
			String strSize = "";
			long size = files[i].length();
			
			if(files[i].isFile() == false) {
				classify = "<DIR>";
			} else {
				classify = "     ";
				strSize = size + "";
				totalSize += (int)size;
				count ++;
			}
			String fileName = files[i].getName();
			
			System.out.print(lastModifiedDate + " " + classify + "\t" + strSize + "\t" + fileName);
			System.out.println();
		}
		
		System.out.println("\t\t" + count + "개 파일" + "\t" + totalSize + "바이트");
		
	}
	
	// 문제 3. C:\storage 디렉터리를 삭제하시오.
	// 파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야 한다.
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "storage");
		
		File[] files = dir.listFiles();
		
		if(files.length != 0) {
			for(int i = 0; i < files.length; i++) {
				files[i].delete();
			}
		}
		dir.delete();
		
	}

	public static void main(String[] args) {
		ex03();
		
	}
	
}
