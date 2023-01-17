package ex02_random;

public class Ex01_Math_random {

	public static void ex01() {
		
		// java.lang.Math 클래스
		
		double randNumber = Math.random();	// 범위 0.0 <= 난수 < 1.0
		System.out.println(randNumber);
		
		if(randNumber < 0.1) {	// 10% 확률
			System.out.println("대박");
		} else {
			System.out.println("꽝");
		}
		
	}
	
	public static void ex02() {
		
		/*
		 	난수 생성하기
		 	Math.random()					0.0 <= n < 1.0
		 	Math.random() * 3				0.0 <= n < 3.0
		 	(int)(Math.random() * 3)		  0 <= n < 3
		 	(int)(Math.random() * 3) + 1	  1 <= n < 4 : 1, 2, 3
		 	-------------------------------------------------------
		 	(int)(Math.random() * 개수) + 시작값
		 */
	
		StringBuilder sb = new StringBuilder();

		for(int count = 0; count < 6; count++) {
			sb.append((int)(Math.random() * 10));
		}
		
		String code = sb.toString();
		System.out.println(code);
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
