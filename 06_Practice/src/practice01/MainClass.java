package practice01;

import java.util.Scanner;

public class MainClass {

	// 문제1. 가위바위보
	// 실행
	// 가위바위보 >>> 가위
	// 당신은 가위, 컴퓨터는 보, 이겼습니다.
	// Hint : 가위는 0, 바위는 1, 보는 2로 처리한다.
	public static void ex01() {
		String[] rsp = {"가위", "바위", "보"};

		System.out.print("가위바위보 >>> ");
		Scanner sc = new Scanner(System.in);
		String strPerson = sc.nextLine();
		sc.close();
		
		int person = 0;
		for(int i = 0; i < rsp.length; i++) {
			if(strPerson.equals(rsp[i])) {
				person = i;
			}
		}

		int computer = (int)(Math.random() * 3);
		String strCom = rsp[computer];

		String result = "";
		switch(person - computer) {
		case 0 : result = "비겼습니다."; break;
		case 1 : case -2 :
				 result = "이겼습니다."; break;
		case 2 : case -1 :
				 result = "졌습니다."; break;
		}

		System.out.println("당신은 " + strPerson +
						", 컴퓨터는 " + strCom + ", " + result);
		
		
	}
	
	// 문제2. 친구 3명을 저장할 수 있는 배열을 생성하고 임의의 값으로 초기화하시오.
	// 새로 사귄 친구의 수를 입력 받아서 기존 친구들이 저장된 배열의 길이를 새로 사귄 친구의 수만큼 늘리시오.
	public static void ex02() {
		String[] friends = {"친구1", "친구2", "친구3"};
		
		System.out.print("새로 사귄 친구의 수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		String[] newFriends = new String[friends.length + number];
		for(int i = 0; i < friends.length; i++) {
			newFriends[i] = friends[i];
		}
		
		friends = newFriends;
		
		for(int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
	}
	
	// 문제3. Scanner 클래스의 next() 메소드를 이용해서 사용자로부터 문자열을 계속 입력 받는다.
	// 사용자가 "종료" 문자열을 입력하면 더 이상 입력 받지 않는다.
	// 총 몇 번만에 종료되었는지 그 횟수를 마지막에 출력한다.
	public static void ex03() {
				
		
		int count = 0;
		while(true) {
			String standard = "";
			Scanner sc = new Scanner(System.in);
			
			standard = sc.next();
			count ++;
			
			if(standard.equals("종료")) {
				sc.close();
				break;
			}
		}
		
		System.out.println("종료까지 입력한 횟수 : " + count);
		
	}

	// 문제4. 퀴즈 정답을 맞힐때까지 계속 퀴즈를 내시오.
	// 질문 : 대한민국의 수도는? >>> 서울
	// 정답입니다.
	// 질문 : 대한민국의 수도는? >>> seoul
	// 정답입니다.
	// 질문 : 대한민국의 수도는? >>> 인천
	// 오답입니다.
	public static void ex04() {	
		while (true) {
			System.out.print("질문 : 대한민국의 수도는? >>> ");
			
			String[] answer = {"서울", "seoul"};

			Scanner sc = new Scanner(System.in);
			String user = sc.next();
	
			boolean condition = false;
			for(int i = 0; i < answer.length; i++) {
				condition = user.equals(answer[i]);
				if(condition == true) {
					System.out.println("정답입니다.");
					sc.close();
					return;
				}
			}
			if(condition == false) {
				System.out.println("오답입니다.");
				continue;
			}
		}
		
	}
	
	// 문제5. 평점 입력 받아서 해당 평점만큼 ★을 출력하시오.
	// 평점은 1 ~ 5 사이 정수로 입력 받는데, 벗어난 범위는 다시 입력 받는다.
	public static void ex05() {
		System.out.print("평점을 입력하세요.(1 ~ 5 사이의 정수) >>> ");
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int score = sc.nextInt();
			
			if(score < 1 || score > 5) {
				System.out.print("다시 입력해주세요. >>> ");
				continue;
			} else {
				sc.close();
				for(int n = 0; n < score; n++) {
					System.out.print("*");
				}
			}
		}
	}
	
	// 문제6. 비밀번호를 "1234"로 가정한다.
	// 사용자로부터 비밀번호를 입력 받아서 "1234"와 같으면 "성공", "1234"가 아니면 다시 비밀번호를 입력 받도록 처리하시오.
	// 비밀번호 입력은 최대 5번으로 제한하고, 5번의 입력이 모두 틀리면 최종적으로 "실패"를 출력하시오.
	public static void ex06() {
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(count < 5) {
			System.out.print("비밀번호를 입력하세요. >>> ");
			String input = sc.next();
			
			if(input.equals(password)) {
				System.out.print("성공");
				return;
			}
			
			else {
				System.out.println("실패");
				count++;
//				continue;
			}
		}
		sc.close();
	}		
	
	// 문제7. 구구단을 외자.
	// 2~9단 사이의 임의의 구구단이 출력되면 정답을 입력한다.
	// 정답을 입력해서 맞으면 "정답", 틀리면 "땡"을 출력하시오.
	// 예시1)
	// 4x9? >>> 36
	// 정답
	// 예시2)
	// 8x7? >>> 49
	// 땡
	public static void ex07() {
		int a = (int)(Math.random() * 8 + 2);
		int b = (int)(Math.random() * 8 + 2);
		
		System.out.print(a + "x" + b + "? >>> ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input == a * b) {
			System.out.print("정답");
		}
		
		else if(input != a * b) {
			System.out.print("땡");
		}
		
		sc.close();
	}
	
	// 문제8. 임의의 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
	// 나이 : 현재년도 - 태어난년도 + 1
	// 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
	// 예시)
	// 28살 여자입니다.
	public static void ex08() {
		String personalId = "941030-2168619";
		
	}
	
	// 문제9. 다음 기준에 따라서 파일명을 변환하시오.
	// Scanner 클래스의 next() 메소드를 이용해서 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
	// 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
	// 예시)
	// 변환 전 파일명 >>> happy.jpg
	// 변환 후 파일명 = happy_1658792128410.jpg
	public static void ex09() {
		
	}
	
	// 문제10. Scanner 클래스의 next() 메소드를 이용해서 사람 이름을 입력 받은 뒤
	// 친구의 이름이면 "반갑다 친구야"를 출력하고, 모르는 사람의 이름이면 "처음 뵙겠습니다"를 출력하시오.
	// 친구의 이름을 String[] friend 배열에 저장한 뒤 작업을 수행하시오.
	// 예시1
	// 이름 입력 >>> 정우성
	// 반갑다 친구야
	// 예시2
	// 이름 입력 >>> 유재석
	// 처음 뵙겠습니다
	public static void ex10() {
		
	}
	
	public static void main(String[] args) {
		ex07();
	}

}