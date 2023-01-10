package ex03_method;

public class Calculator {

	// 메소드 (함수)

	/*
	 	메소드 형식
	 	
	 	반환타입 메소드명(매개변수) {
	 		메소드 본문
	 		return 반환값
	 	}
	 	
	 	1. 반환값 + 반환타입
	 		메소드 실행의 결과
	 	2. 메소드명
	 		개발자 마음대로 정함
	 	3. 매개변수
	 		메소드로 전달되는 값(인수, argument)을 저장하는 변수
	 */

	/*
	 	메소드의 4가지 형식				메소드 호출
	 	
	 	1. 반환값 X, 인수 X				method();
	 		void method() {	
	 			메소드 본문
	 		}
	 		ㄴ 반환값X : 반환타입 void
	 	
	 	2. 반환값 X, 인수 O				int a = 0;
	 		void method(int arg) {		method(a);
	 			메소드 본문
	 		}
	 	
	 	3. 반환값 O, 인수 X				int result;
	 		int method() {				result = method();
	 			메소드 본문
	 			return 반환값
	 		}
	 	
	 	4. 반환값 O, 인수 O				int a = 0;
	 		int method(int arg) {		int result;
				메소드 본문				result = method(a);
				return 반환값
	 		}
	 */

	
	
	// addition 메소드 정의
	double addition(double a, double b) {
		return a + b;
	}
	
	// subtraction 메소드 정의
	double subtraction(double a, double b) {
		return a - b;
	}
	
}
