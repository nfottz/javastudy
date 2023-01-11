package practice;

public class Exam01 {
	
	public static void ex01() {

		// 문제1. int serial의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
		// int serial의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
		// 예시
		// 남자입니다.
		
		int a = 6442;
		
		while (a >= 10) {
			a = (a / 10);
		}

		if(a % 2 == 0) {
			System.out.println("여자입니다.");
		}
		
		else if(a % 2 != 0) {
			System.out.println("남자입니다.");
		}
	}
	
	public static void ex03() {
		
	// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
	// 예시
	// 2 x 1 = 2
	// 2 x 2 = 4
	// ...
	// 5 x 5 = 25
		
		int k = 5;
		
		for(int a = 2; a <= 9; a++) {
			for(int b = 1; b <= 9 ; b++) {
				System.out.println(a + " x " + b + " = " + (a * b));
				
				if(a == k && b == k) {
					break;
					}	
				}
			if(a == k) {
				break;
			}
		}
	}
	
	public static void ex05() {
		
		// 문제5. 1부터 100 사이의 모든 짝수와 홀수를 각각 더한 결과를 모두 출력하시오.
		// 예시
		// 짝수 합은 2550입니다.
		// 홀수 합은 2500입니다.
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 1; i <= 100; i++) {

			if(i % 2 == 0) {
				sumEven += i;
			}
			
			if(i % 2 != 0) {
				sumOdd += i;
			}
		}
		
		System.out.println("짝수 합은 " + sumEven + "입니다.");
		System.out.println("홀수 합은 " + sumOdd + "입니다.");
		
	}
	
	public static void ex() {
		
//		for(int a = 1; a <= 100; a++) {
//			boolean condition1 = (a % 3 == 0);
//			if(condition1 == true) {
//				System.out.println(a);
//			}
//		}
		
		for(int a = 0; a <= 9; a++) {
			for(int b = 1; b <= 10; b++) {
				int num = (a * 10) + b;
				
				boolean condition1 = (b % 3 == 0);
				boolean condition2 = ((a % 3) == 0 && a != 0);
				
				if(condition1 == true && condition2 == true) {
					System.out.print("짝짝\t");
				}
				else if(condition1 == true || condition2 ==true) {
					System.out.print("짝\t");
				}
//				if(b == 10 && num % 3 == 0) {
//					System.out.println("짝\t");
//				}
				else {
					System.out.print(num+"\t");
				}
			}
			System.out.println();
		}
		
	}

	public static void ex2() {
		
		for(int a = 0; a <= 9; a++) {
			for(int b = 0; b <= 9; b++) {
				int num = (a * 10) + (b + 1);
				
				boolean condition1 = ((b + 1) % 3 == 0);
				boolean condition2 = ((a % 3) == 0 && a != 0);
				
				if(condition1 == true && condition2 == true) {
					System.out.print("짝짝\t");
				}
				else if(condition1 == true || condition2 == true) {
					if(b == 9) {
						System.out.print(num+"\t");
					}
					else {
						System.out.print("짝\t");
					}
				}
				else if(num % 3 == 0 && b == 9) {
					System.out.print("짝\t");
				}
				else {
					System.out.print(num+"\t");
				}
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		ex2();
	}

}
