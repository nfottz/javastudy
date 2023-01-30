package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void ex01() {
		
		// 배열 리스트(ArrayList) 선언 및 생성
		List<String> list = new ArrayList<>();
		
		// 추가
		list.add("summer");		// 인덱스 지정이 없으면 항상 마지막에 추가됨
		list.add("autumn");
		list.add("frog");
		list.add("winter");
		list.add(0, "spring");	// 인덱스 0에 spring 추가됨
		
		// 수정
		list.set(2, "fall");	// 인덱스 2의 요소를 fall로 수정함
		
		// 삭제
//		list.remove("frog");	삭제할 대상을 전달
		list.remove(3);		 // 삭제할 대상의 인덱스를 전달
		
		// 확인
		System.out.println(list);
		
	}
	
	public static void ex02() {
		
		// ArrayList 초기화
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		// 리스트 길이
		System.out.println("리스트 길이 : " + list.size());
		
		// 개별 요소 확인
		System.out.println("첫 번째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(list.size() - 1));
		
		// 리스트 순회
		// 모든 요소의 합계 구하기
		int sum = 0;
		for(int i = 0, length = list.size(); i < length; i++) {
			sum += list.get(i);
		}
		System.out.println("모든 요소의 합 : " + sum);
		
	}
	
	public static void ex03() {		// 연습
		
		List<User> userList = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			User user = new User("user", "123456");
			userList.add(i, user);
		}
		
		// 아이디만 출력하기
		for(int i = 0, length = userList.size(); i < length; i++) {
			System.out.println(userList.get(i).getId());
		}
		
//		for(User user : userList) {
//			System.out.println(user.getId());
//		}
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
