package ex04_Scanner;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 	java.util.Scanner
		 	1. 어떤 정보를 읽어 들일 때 사용한다.
		 	2. 사용자로부터 입력된 정보를 처리하는 용도로 주로 사용한다.
		 	3. 데이터 타입에 따라 입력 메소드가 구분되어 있다.
		 		1) int		: nextInt()
		 		2) long		: nextLong()
		 		3) double	: nextDouble()
		 		4) String (1) next()	 : 공백 포함 불가능
		 				  (2) nextLine() : 공백 포함 가능
		 */
		
		/*
		 	기본 입출력 장치(콘솔)
		 	1. 기본 출력 장치(모니터) : System.out
		 	2. 기본 입력 장치(키보드) : System.in
		 */
		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// String 입력
		System.out.print("이름이 뭐예요? >>> ");
		String name = sc.nextLine();
		System.out.println("입력된 이름은 " + name + "입니다.");
		
		// int 입력
		System.out.print("몇살이에요? >>> ");
		int age = sc.nextInt();
		System.out.println("입력된 나이는 " + age + "살입니다.");
		
		// double 입력
		System.out.print("키는 얼마인가요? >>> ");
		double height = sc.nextDouble();
		System.out.println("입력된 키는 " + height + "cm입니다.");
		
		// char 입력
		System.out.print("성별은 무엇인가요?(남/여) >>> ");
		char gender = sc.next().charAt(0);
		System.out.println("입력된 성별은 " + gender + "입니다.");
		
		// Scanner 객체 종료(생략 가능)
		sc.close();
		
		
	}

}
