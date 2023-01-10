package ex02_two_dim;

public class Ex02_advanced_for {

	public static void ex01() {
		
		int[][] scores = {
				{70, 80, 90},
				{80, 90, 100},
				{50, 60, 70}
		};
		
		for(int[] arr : scores) {
			for(int score : arr) {
				System.out.print(score + "\t");
			}
			System.out.println();
		}
		
	}
		
	public static void ex02() {
		
		String[][] timeTable = {
				{"국어", "윤리", "수학", "체육"},
				{"미술", "수학", "영어"},
				{"사회", "한자", "수학", "국어", "영어"},
				{"음악", "국어", "윤리"},
				{"수학", "영어", "체육", "과학"}
		};
		
		for(String[] arr : timeTable) {
			for(String subject : arr) {
				System.out.print(subject + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
