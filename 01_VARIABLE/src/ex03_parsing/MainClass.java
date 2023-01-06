package ex03_parsing;

public class MainClass {

	public static void main(String[] args) {

		// 구문 분석(parsing)
		// 문자열을 기본 타입으로 변환하는 과정을 의미한다.
		
		String strScore = "90";
		String strMoney = "10000000000";
		String strEye = "0.7";
		
		// String -> int 변환
		int score = Integer.parseInt(strScore);
		System.out.println(score);
		
		// String -> long 변환
		long money = Long.parseLong(strMoney);
		System.out.println(money);
		
		// String -> double 변환
		double eye = Double.parseDouble(strEye);
		System.out.println(eye);
		
	}

}
