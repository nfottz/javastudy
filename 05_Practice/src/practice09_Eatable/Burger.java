package practice09_Eatable;

// extends Food : 음식이다.
// 먹을 수 없으면 implements Eatable 을 구현하지 않는다.

public class Burger extends Food {

	public Burger(String foodName, int foodCalorie) {
		super(foodName, foodCalorie);
	}
	
}
