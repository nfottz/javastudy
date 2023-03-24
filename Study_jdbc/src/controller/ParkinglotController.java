package controller;

import java.util.Scanner;

import service.ParkinglotService;
import service.ParkinglotServiceImp;

public class ParkinglotController {

	private Scanner sc;
	private ParkinglotService service;
	
	public ParkinglotController() {
		sc = new Scanner(System.in);
		service = new ParkinglotServiceImp();
	}
	
	public void play() {

		while(true) {
			System.out.println("1.추가 2.삭제 3.전체정보출력 0.종료 >>>");
			String choice = sc.next();
			   
			switch(choice) {
			case "1":
				service.addCar(); break;
			case "2":
				service.deleteCar(); break;
			case "3":
				service.printAllCars(); break;
			case "0":
				System.out.println("종료");
			    return;
			default:
			 System.out.println("존재하지 않는 메뉴입니다."); 
			}
		}
		
	}
	
}
