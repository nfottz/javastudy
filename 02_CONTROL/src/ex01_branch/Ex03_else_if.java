package ex01_branch;

public class Ex03_else_if {

	public static void ex01() {
		
		// 80 이상 : 상
		// 60 이상 : 중
		// 나머지  : 하
		
		int score = 50;
		
		if(score >= 80) {
			System.out.println("상");
		}
		else if(score >= 60) {
			System.out.println("중");
		}
		else {
			System.out.println("하");
		}
		
	}
	
	public static void ex02() {
		
		// 90 이상 수, 80 우, 70 미, 60 양, 가, 잘못된 점수
		
		int score = 40;
		
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수");
		}
		else if (score >= 90) {
			System.out.println("수");
		}
		else if (score >= 80) {
			System.out.println("우");
		}
		else if (score >= 70) {
			System.out.println("미");
		}
		else if (score >= 60) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
		
	}
	
	public static void ex03() { // 연습
		
		int month = 17;
		
		int mod = month % 12;
		
		if(mod <= 2) {
			System.out.println("겨울");
		}
		else if(mod <= 5) {
			System.out.println("봄");
		}
		else if(mod <= 8) {
			System.out.println("여름");
		}
		else {
			System.out.println("가을");
		}
		
	}
	
	public static void ex04() { // 연습
		
		int day = 6;
		int nDay = 10;	// 10일 후
		
		day += nDay;	// day = day + nDay;
		
		String weekName;	// 월요일
		
		int mod = day % 7;
		
		if(mod == 0) {
			weekName = "토";
		}
		else if(mod == 1) {
			weekName = "일";
		}
		else if(mod == 2) {
			weekName = "월";
		}
		else if(mod == 3) {
			weekName = "화";
		}
		else if(mod == 4) {
			weekName = "수";
		}
		else if(mod == 5) {
			weekName = "목";
		}
		else {
			weekName = "금";
		}
		
		System.out.println(nDay + "일 후는 " + weekName + "요일");
		
	}
	
	public static void main(String[] args) {
		ex04();
	}

}