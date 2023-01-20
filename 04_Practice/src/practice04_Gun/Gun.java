package practice04_Gun;

public class Gun {

	// 필드
	private String model;
	private int bullet;
	
	// 상수
	public static final int MAX_BULLET = 20;
	
	// 메소드
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	// 총알 넣기
	public void reload(int bullet) {
		if(this.bullet + bullet > MAX_BULLET) {
			System.out.println(bullet + "발 장전 불가함.");
			return;
		}
		this.bullet += bullet;
		System.out.println(bullet + "발 장전 완료. 현재 " + this.bullet + "발 있음.");
	}
	
	// 총 쏘기
	public void shoot() {
		if(bullet == 0) {
			System.out.println("헛빵! 총알이 없음.");
			return;
		}
		bullet--;
		System.out.println("빵! 현재 " + bullet + "발 있음.");
	}
	
}