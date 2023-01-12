package ex02_has_a;

/*
 	has a 관계
 	1. 상속 관계로 만들 수 있는 관계이다.
 	2. Soldier has a Gun
 	3.  자식   has a 부모
 */

public class Gun {

	// 필드
	private String model;
	private int bullet;
	private final int MAX_BULLET = 20;
	
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
//		if(this.bullet == MAX_BULLET) {
//			return;
//		}
//		this.bullet += bullet;
//		this.bullet = (this.bullet > MAX_BULLET)? MAX_BULLET : this.bullet;
		
		for(int i = 1; i <= bullet; i++) {
			if(this.bullet < MAX_BULLET) {
				this.bullet++;
			}
		}
		return;
	
	}
	
	// 총 쏘기
	public void shoot() {
		if(bullet <= 0) {
			System.out.println("헛빵");
			return;
		}
		bullet --;
		System.out.println("빵");
	}
	
}
