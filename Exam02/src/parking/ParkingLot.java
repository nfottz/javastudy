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
		
//		for(int i = 0; i < idx; i++) {		
//			 if(carNo.equals(cars[i].getCarNo())) {
//				System.out.println("이미 등록된 차량입니다.");
//				return;
//			}
//		}
		
			 cars[idx++] = new Car(carNo, model);

		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
		
	}
	
	public void deleteCar() {
		
		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		
		System.out.print("차량 번호를 입력해주세요. >>> ");	
		String carNo = sc.next();
		
		for(int i = 0; i < idx; i++) {		
			 if(carNo.equals(cars[i].getCarNo())) {
				 
				 // 방법1. 삭제할 요소의 뒤에 있는 요소들을 모두 앞으로 한 칸씩 옮기기
//				 System.arraycopy(cars, (i + 1), cars, i, (idx - 1 - i));

				 // 방법2. 마지막 차량 옮겨오기
				 cars[i] = cars[--idx];
				 // cars[i] = cars[idx - 1];
				 
				cars[--idx] = null;
				
				System.out.println("차량번호 " + carNo + "차량이 삭제되었습니다.");
				return;
				
				}
			}

		System.out.println("대상 차량이 존재하지 않습니다.");
		
	}
	
	public void printAllCars() {
		
		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		
		System.out.println(name + " 차량 목록");
		
		for(int i = 0; i < idx; i++) {
			System.out.println(cars[i]);
		}
		
	}
	
	public void manage() {

		while(true) {
			
			System.out.print("1. 추가  2. 삭제  3. 전체정보출력  0. 종료 >>>");
			
			String choice = sc.next();
			
			switch(choice) {
			case "1": addCar(); break;
			case "2": deleteCar(); break;
			case "3": printAllCars(); break;
			case "0": return;

			default:
				System.out.println("존재하지 않는 메뉴입니다.");
				continue;
			}
			
		}
		
	}
	
}
