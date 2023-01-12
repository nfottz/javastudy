package practice02_soldier;

public class Soldier {

	// 필드
	private Gun gun;	// 초기값은 null
	
	// 생성자
	public Soldier() {
		gun = new Gun();
	}
	
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	public void shoot() {
		gun.shoot();
	}
	
}
