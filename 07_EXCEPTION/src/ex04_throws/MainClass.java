package ex04_throws;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = new Gun();
		
		try {
			gun.reload(17);		// reload 메소드 호출

			for(int n = 0; n < 7; n++) {
				gun.shoot();
			}

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
