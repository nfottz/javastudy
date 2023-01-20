package practice05_Employee;

import java.util.Scanner;

public class Company {

	private Employee[] employees;
	private int idx;
	private Scanner sc;
	
	public Company() {
		employees = new Employee[5];  // 사원을 최대 5명 고용할 수 있는 회사
		sc = new Scanner(System.in);
	}
	
	public void addEmployee() {
		if(idx == employees.length) {
			System.out.println("더 이상 사원을 고용할 수 없습니다.");
			return;
		}
		System.out.print("고용 형태 선택(1.정규 2.비정규) >>> ");
		String kind = sc.next();
		System.out.print("신규 사원번호 >>> ");
		int empNo = sc.nextInt();
		System.out.print("신규 사원명 >>> ");
		String name = sc.next();
		switch(kind) {
		case "1":
		case "정규":
			System.out.print("기본급 >>> ");
			int salary = sc.nextInt();
			employees[idx++] = new Regular(empNo, name, salary);
			break;
		case "2":
		case "비정규":
			System.out.print("시급 >>> ");
			int hourPay = sc.nextInt();
			Temporary temporary = new Temporary(empNo, name, hourPay);
			employees[idx++] = temporary;
			break;
		default: 
			System.out.println("잘못된 고용 형태입니다. 다시 시도하세요.");
		}
		System.out.println("사원 등록 완료. 현재 등록된 사원 " + idx + "명");
	}
	
	public void dropEmployee() {
		if(idx == 0) {
			System.out.println("등록된 사원이 없습니다.");
			return;
		}
		System.out.print("삭제할 사원번호 >>> ");
		int empNo = sc.nextInt();
		for(int i = 0; i < idx; i++) {
			if(empNo == employees[i].getEmpNo()) {
				System.arraycopy(employees, i + 1, employees, i, idx - 1 - i);
				employees[--idx] = null;
				System.out.println("사원 삭제 완료. 현재 등록된 사원 " + idx + "명");
				return;
			}
		}
		System.out.println("사원번호 " + empNo + "인 사원은 존재하지 않습니다.");
	}
	
	public void findEmployee() {
		if(idx == 0) {
			System.out.println("등록된 사원이 없습니다.");
			return;
		}
		System.out.print("조회할 사원번호 >>> ");
		int empNo = sc.nextInt();
		for(int i = 0; i < idx; i++) {
			if(empNo == employees[i].getEmpNo()) {
				System.out.println("사원 조회 완료. 조회된 사원 정보");
				employees[i].info();
				System.out.println();
				return;
			}
		}
		System.out.println("사원번호 " + empNo + "인 사원은 존재하지 않습니다.");
	}
	
	public void printAllEmployees() {
		if(idx == 0) {
			System.out.println("등록된 사원이 없습니다.");
			return;
		}
		int totalPay = 0;  // 전체 사원의 급여 합계
		System.out.println("전체 사원 목록(" + idx + "명)");
		for(int i = 0; i < idx; i++) {
			employees[i].info();
			System.out.println("[월급:" + employees[i].getPay() + "원]");
			totalPay += employees[i].getPay();
		}
		System.out.println("[사원 전체 급여:" + totalPay + "원]");
	}
	
	public void manage() {
		while(true) {
			System.out.print("1.추가 2.삭제 3.조회 4.목록 0.종료 >>> ");
			String choice = sc.next();
			switch(choice) {
			case "1": addEmployee(); break;
			case "2": dropEmployee(); break;
			case "3": findEmployee(); break;
			case "4": printAllEmployees(); break;
			case "0": System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못된 요청입니다. 다시 시도하세요.");
			}
		}
	}
	
}
