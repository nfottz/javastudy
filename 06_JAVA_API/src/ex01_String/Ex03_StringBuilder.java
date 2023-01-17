package ex01_String;

public class Ex03_StringBuilder {

	public static void main(String[] args) {

		/*
	 	java.lang.StringBuilder 클래스(JDK1.5 ~)
	 	1. String을 연결하는 클래스이다.
	 	2. 싱글스레드 환경에서만 사용이 가능하다.
	 	3. 동작이 빠르다.
	 */
		
		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// 문자열 연결
		sb.append("app");
		sb.append("le");
		
		// StringBuilder를 String으로 변환
		String str = sb.toString();
		System.out.println(str);
		
	}

}
