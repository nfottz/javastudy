package ex02_has_a;

public class MainClass {

	public static void main(String[] args) {

		Soldier soldier = new Soldier();
		
//		soldier.setBullet(5);
		
		soldier.reload(2);
//		System.out.println(soldier.getBullet());
		soldier.shoot();
		soldier.shoot();
		soldier.shoot();
		
	}

}
