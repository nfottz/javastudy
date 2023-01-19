package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		System.out.println("현재 등록된 차량 : " + idx +"대");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}

		System.out.print("차량 번호를 입력해주세요. >>> ");
		String carNo = sc.next();
		System.out.print("모델명을 입력해주세요. >>> ");
		String model = sc.next();
		
		cars[idx++] = new Car(carNo, model);
				
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
	}
	
	public void deleteCar() {
		System.out.print("차량 번호를 입력해주세요. >>> ");
		String carNo = sc.next();
		
		for(int i = 0; i < idx; i++) {		
			 if(carNo.equals(cars[i].getCarNo())) {
				cars[i] = cars[--idx];
				System.out.println("차량번호 " + carNo + "차량이 삭제되었습니다.");
				return;
			}
		}
		System.out.println("해당하는 차량이 없습니다.");
	}
	
	public void printAllCars() {
		System.out.println("---- " + name + " 주차 현황 ----");
		System.out.println("현재 등록된 총 차량 : " + idx + "");
		for(int i = 0; i < idx; i++) {
			System.out.print("차량번호 : " + cars[i].getCarNo() 
					+ ", 모델 : " + cars[i].getModel() + "\n");
		}
	}
	
	public void manage() {

//		loop:
		while(true) {
			
			System.out.print("1. 추가  2. 삭제  3. 전체정보출력  0. 종료 >>>");
			
			String choice = sc.next();
			
			switch(choice) {
			case "1": addCar(); break;		// addCar 호출
			case "2": deleteCar(); break;
			case "3": printAllCars(); break;
			case "0": return;					// manage 메소드 종료
//				break loop;
			default:
				System.out.print("존재하지 않는 메뉴입니다.");
				continue;
			}
			
		}
		
	}
	
}
