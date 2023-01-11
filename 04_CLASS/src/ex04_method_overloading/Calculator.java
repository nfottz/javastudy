package ex04_method_overloading;

public class Calculator {
	
	/*
	 	메소드 오버로딩
	 	1. 같은 이름의 메소드를 여러 개 만들 수 있다.
	 	2. 제한 조건
	 		1) 메소드 이름이 같아야 한다.
	 		2) 매개변수의 타입이나 개수가 달라야 한다.
	 		3) 주의: 반환타입은 메소드 오버로딩과 연관이 없다.
	 */
	
	double addition(double a, double b) {
		return a + b;
	}
	
	double addition(double[] numbers) {
		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
	
}
