package practice06_Shape;

public class Rectangle implements Shape {

	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

}
