package ex07_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void printList(List<Integer> list) {
		
		int lastIndex = list.size() - 1;
		
		for(int i = 0; i < lastIndex; i++) {
			System.out.print(list.get(i) + " → ");
		}
		System.out.println(list.get(lastIndex));

//		for(int i = 0, length = list.size(); i < length; i++) {
//			System.out.print(list.get(i));
//			
//			if(i < length - 1) {
//				System.out.print(" → ");
//			}
//		}

	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 3, 1, 4);
		
		printList(list);	// 5 → 2 → 3 → 1 → 4
		
		Collections.sort(list);	// 오름차순 정렬
		printList(list);		// 1 → 2 → 3 → 4 → 5
		
		int idx = Collections.binarySearch(list, 11);	// 이진 검색(반드시 정렬이 되어 있어야 한다.)
//		System.out.println(idx);
		if (idx >= 0) {
			System.out.println("찾았다.");
		} else {
			System.out.println("못찾았다.");
		}
		
	}
	
}
