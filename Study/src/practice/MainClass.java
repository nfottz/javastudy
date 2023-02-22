package practice;

public class MainClass {

	public static void main(String[] args) {
		
		int num = 29183;
		int k = 1;
		
		String numStr = num + "";
		String kStr = k + "";
		
		for(int i = 0, length = numStr.length(); i < length; i++) {
			if((numStr.charAt(i)+"").equals(kStr)) {
				System.out.println(i);
			}
		}
		
	}
	
}
