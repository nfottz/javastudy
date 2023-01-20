package practice01_Car;

public class MainClass {

	public static void main(String[] args) {
		
		Hybrid car = new Hybrid();
		
		car.drive();   // 달린다.
		car.charge();  // 충전한다.
		car.addOil();  // 기름을 넣는다.
		
	}

}
