package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	// 문제3. C:\storage 디렉터리를 삭제하시오.
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

	
	// 문제4. 사용자로부터 입력받은 문자열을 C:\storage\diary.txt 파일로 보내시오.
	// 총 5개 문장을 입력 받아서 보내시오.
	public static void ex04() {
		
		String[] strArr = new String[5];
		System.out.print(strArr.length + "문장을 입력하세요. >>> ");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0, length = strArr.length; i < length; i ++) {
			String str = sc.nextLine();
			strArr[i] = str;
		}
		
		sc.close();
		
		File dir = new File("C:" + File.separator + "examStorage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex04.txt");
		
		try(PrintWriter out = new PrintWriter(file)){
			
			for(int i = 0, length = strArr.length; i < length; i++) {
				out.println(strArr[i]);
			}
			
			System.out.println(file.getName() + " 파일이 생성되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 문제5. 예외가 발생한 경우 예외 메시지와 예외 발생시간을 저장한 C:\storage\log.txt
	// 예시)
	// 2023-01-26 12:08:30 / by zero
	public static void ex05() {
		
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("첫 번째 정수를 입력하세요. >>> ");
			int number1 = sc.nextInt();
			
			System.out.println("두 번째 정수를 입력하세요. >>> ");
			int number2 = sc.nextInt();
			
			int add = number1 + number2;
			int sub = number1 - number2;
			int mul = number1 * number2;
			int div = number1 / number2;
			
			System.out.println(number1 + " + " + number2 + " = " + add);
			System.out.println(number1 + " - " + number2 + " = " + sub);
			System.out.println(number1 + " * " + number2 + " = " + mul);
			System.out.println(number1 + " / " + number2 + " = " + div);
			
			sc.close();
		
		} catch(Exception e) {
			
			File dir = new File("C:" + File.separator + "examStorage");
			File file = new File(dir, "log.txt");
			
		}
		
	}
	
	public static void main(String[] args) {
		ex05();
		
	}
	
}
