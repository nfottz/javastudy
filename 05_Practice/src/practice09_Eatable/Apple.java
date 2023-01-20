package practice09_Eatable;

// extends Food : 음식이다.
// implements Eatable : 먹을 수 있다.

public class Apple extends Food implements Eatable {

	public Apple(String foodName, int foodCalorie) {
		super(foodName, foodCalorie);
	}
	
}