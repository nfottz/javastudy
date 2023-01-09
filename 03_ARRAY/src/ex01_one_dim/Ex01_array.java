package ex01_one_dim;

public class Ex01_array {

	/*
	 	배열이란?
	 	1. 여러 개의 변수를 하나의 이름으로 관리하는 자료 구조
	 	2. 배열의 구성 요소
	 		1) 배열명 : 모든 변수의 대표 이름
	 		2) 인덱스 : 각 변수를 구분하기 위한 위치 정보. 0부터 시작하는 정수값.
	 */
	
	/*
	 	배열의 사용 방법
	 	1. 배열의 선언
	 		1) int[] arr(이름 아무거나);	// 권장
	 		2) int arr[];
	 	2. 배열의 생성
	 		arr(이름) = new int[5];
	 */
	
	/*
	 	배열요소
	 	1. 배열의 각 변수를 의미
	 	2. 배열명[인덱스]
	 	3. 배열이 생성되면 자동으로 초기화된다.
	 		0(int), 0.0(double), false(boolean), null(참조타입) 값으로 초기화된다.(값이 없음을 의미)
	 */
	
	public static void ex01() {
		
		// 배열 선언
		int[] arr;
		
		// 배열 생성
		arr = new int[5];
		
		// 배열 요소
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}  
	
	public static void ex02() {
		
		// 배열 선언 + 생성
		int[] arr = new int[5];
		
		// 배열 요소 순회(하나씩 접근하기)
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void ex03() {
		
		// 배열 길이
		int length = 5;
		
		// 배열 선언 + 생성
		int[] arr = new int[length];
		
		// 배열 순회
		for(int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void ex04() {
		
		// 배열 선언 + 생성
		int[] arr = new int[5];
		
		// 배열 순회
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void ex05() { // 연습
		
		// 점수를 배열로 관리하기
		int[] scores = new int[5];
		
		// 각 점수를 배열에 저장하기
		scores[0] = 100;
		scores[1] = 70;
		scores[2] = 95;
		scores[3] = 83;
		scores[4] = 76;
		
		// 합계(평균), 최대/최소
		int total = 0;	// zero
		int max = 0;	// 가장 작은 값
		int min = 100;	// 가장 큰 값

		for(int i = 0; i < 5; i++) {
			total += scores[i];
			if(max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.println("합계 : " + total + "점");
		System.out.println("평균 : " + ((double)total / scores.length) + "점");
		System.out.println("최대 : " + max + "점");
		System.out.println("최소 : " + min + "점");
		
	}
	
	public static void ex06() { // 연습
		
		// 점수를 배열로 관리하기
		int[] scores = new int[5];
		
		// 각 점수를 배열에 저장하기
		scores[0] = 100;
		scores[1] = 70;
		scores[2] = 95;
		scores[3] = 83;
		scores[4] = 76;
		
		// 배열의 첫 번째 요소를 초기화로 저장하고,
		// 배열의 두 번째 요소부터 순회한다.
		
		// 합계(평균), 최대/최소
		int total = scores[0];
		int max = scores[0];
		int min = scores[0];

		for(int i = 1; i < 5; i++) {
			total += scores[i];
			if(max < scores[i]) {
				max = scores[i];
			}
			if (min > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.println("합계 : " + total + "점");
		System.out.println("평균 : " + ((double)total / scores.length) + "점");
		System.out.println("최대 : " + max + "점");
		System.out.println("최소 : " + min + "점");
		
	}
	
	public static void ex07() {
		
		// 배열 초기화
		int[] arr = {10, 20, 30};
		
		// 배열 순회
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void ex08() {	// 연습
		
		String[] weekName = {"토", "일", "월", "화", "수", "목", "금"};
		
		int day = 13;
		
		System.out.println(day + "일은 " + weekName[day % weekName.length] + "요일이다.");
		
	}
	
	public static void ex09() {
		
		String[] season = {"겨울", "봄", "여름", "가을"};
		
		int month = 1;

		System.out.println(month +"월은 " + season[month % 12 / 3] + "이다.");
		
	}
	
	public static void main(String[] args) {
		ex09();
	}

}
