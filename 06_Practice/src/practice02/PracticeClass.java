package practice02;

import java.util.Scanner;

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
	
	public static void random() {
		
		char a = (char)65;
		System.out.println(a);
	}
	
	public static void ex10() {
		
		System.out.print("얼마나 구입하시겠습니까? >>> ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int amount = input / 1000;
		sc.close();
		
		for(int i = 0; i < amount; i++) {			
			System.out.print("0" + (i % 5 + 1) + " : ");
			int[] lotto = new int[6];
			
			for(int j = 0; j < 6; j++) {
				int num = (int)((Math.random() * 45) + 1);
				
				for(int k = 0; k < j; k++) {
					if(num == lotto[k]) {
						break;
					}
				}
				lotto[j] = num;
				
				System.out.printf("%2d", lotto[j]);
				System.out.print("  ");
			} System.out.println();
			if(i % 5 == 4) {
				System.out.println("------------------------------");
			}
		}
		
	}
	
	public static void main(String[] args) {
		ex10();
	}
}
