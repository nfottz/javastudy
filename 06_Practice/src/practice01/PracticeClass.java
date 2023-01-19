package practice01;

public class PracticeClass {

	public static void ex04() {
		
		String[] answer = {"서울", "seoul"};
		String input = "서울";
		
		boolean result = false;
		
		for(int i = 0; i < answer.length; i++) {
			result = input.equals(answer[i]);
			if(result == true) {break;}
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		ex04();
	}
}
