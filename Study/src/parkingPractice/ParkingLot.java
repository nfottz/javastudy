package parkingPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

	private String name;
	private List<Car> cars;
	private int max;
	private Scanner sc;
	
	public ParkingLot(String name, int max) {
		this.name = name;
		this.max = max;
		cars = new ArrayList<Car>();
		sc = new Scanner(System.in);
	}
	
	 private void addCar() {
		  if(cars.size() == max) {
		   System.out.println("더 이상 차량 등록이 불가능 합니다.");
		   return;
		  }
		  System.out.print("차량번호 >>> ");
		  String carNo = sc.next();
		  System.out.print("모델번호 >>> ");
		  String model = sc.next();
		  cars.add(new Car(carNo, model));
		  System.out.println("차량번호: " +  carNo + " 차량이 등록되었습니다." );
		 }
		 
		 private void deleteCar() {
		  if(cars.size() == 0) {
		   System.out.println("등록된 차량이 없습니다.");
		   return;
		  }
		  System.out.print("차량번호 >>> ");
		  String carNo = sc.next();
		  for(Car car : cars) {
		   if(carNo.equals(car.getCarNo())) {
		    cars.remove(car);
		    System.out.println("차량번호: " + carNo + " 차량이 삭제되었습니다.");
		    return;
		   }
		  }
		  System.out.println("차량 번호를 다시 입력하시오.");
		 }
		 
		 private void printAllCars() {
		  if(cars.size() == 0) {
		   System.out.println("등록된 차량이 없습니다.");
		   return;
		  }
		  System.out.println("등록된 차량 정보");
		  for(Car car : cars) {
		   System.out.println("차량번호: " + car.getCarNo() + " 차량모델: " + car.getModel());
		  }
		 }
		 
		 public void manage() {
		  
		  while(true) {
		   System.out.println("1.추가 2.삭제 3.전체정보출력 0.종료 >>>");
		   String choice = sc.next();
		   
		   switch(choice) {
		   case "1":
		    addCar();
		    break;
		   case "2":
		    deleteCar();
		    break;
		   case "3":
		    printAllCars();
		    break;
		   case "0":
		    return;
		   default:
		    System.out.println("존재하지 않는 메뉴입니다."); 
		   }
		  }
		 }
		 
}
