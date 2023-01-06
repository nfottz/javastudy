package ex02_casting;

public class Ex01_promotion {

	public static void main(String[] args) {
		
		// 자동 변환
		// 1. 작은 크기 -> 큰 크기
		// 2. 정수 -> 실수
		
		long money = 10000; // 4바이트를 사용한 10000이 8바이트 money로 promotion
		System.out.println(money);
		
		double score = 90; // 정수 90을 실수 90.0으로 promotion
		System.out.println(score);
		
		long x = 100;
		
	}

}
