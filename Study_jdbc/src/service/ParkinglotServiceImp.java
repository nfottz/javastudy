package service;

import java.util.Scanner;

import dao.ParkinglotDAO;
import dto.ParkinglotDTO;

public class ParkinglotServiceImp implements ParkinglotService {

	private Scanner sc;
	private ParkinglotDAO dao;
	
	public ParkinglotServiceImp() {
		sc = new Scanner(System.in);
		dao = ParkinglotDAO.getInstance();
	}
	
	@Override
	public void addCar() {
		
		System.out.println(" ===== 차량 주차하기 ===== ");
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();
		System.out.print("모델번호 >>> ");
		String model = sc.next();
		ParkinglotDTO car = new ParkinglotDTO();
		car.setCarNo(carNo);
		car.setModel(model);
		int addResult = dao.insertCar(car);
		System.out.println("차량번호: " +  carNo + ", " + addResult +"대의 차량이 등록되었습니다." );
	}
	
	@Override
	public void deleteCar() {
		
		System.out.println(" ===== 차량 삭제하기 ===== ");

			System.out.print("차량번호 >>> ");
			String carNo = sc.next();
			int removeResult = dao.deleteCar(carNo);
			System.out.println("차량번호: " + carNo + ", " + removeResult + "대의 차량이 삭제되었습니다.");

	}
	
	@Override
	public void printAllCars() {
		
		System.out.println(" ===== 전체 차량 조회하기 ===== ");
		for(ParkinglotDTO car : dao.selectAllCars()) {
			System.out.println(car);
		}
		
	}

	
}
