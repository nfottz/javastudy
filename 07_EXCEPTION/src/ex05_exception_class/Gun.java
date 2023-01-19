package ex05_exception_class;

public class Gun {

	private int bullet;
	public static final int MAX_BULLET = 10;
	
	// 총알 넣기
	public void reload(int bullet) throws GunException {
						// reload 메소드를 호출하는 곳으로 예외를 던진다.
		if(this.bullet + bullet > MAX_BULLET) {
			throw new GunException("장전 불가능", "A-1");
		}
		this.bullet += bullet;
		System.out.println(this.bullet + "발 장전 완료");
	}
	
	// 총쏘기
	public void shoot() throws GunException {
		if(bullet == 0) {
			throw new GunException("총알 부족", "A-2");
		}
		bullet --;
		System.out.println("빵!" +bullet + "발 남았음");
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
}
