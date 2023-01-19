package ex05_exception_class;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gun gun = new Gun();
		
		while(true) {
			
			try {
				
				System.out.println("1. 장전    2. 발사     0. 종료 >>> ");
				String choice = sc.next();
				
				switch(choice) {
				case "1" : 
					gun.reload(5);
					break;
				case "2" :
					gun.shoot();
					break;
				case "0" :
					System.out.println("프로그램 종료");
					sc.close();
					return;
				default :
					throw new RuntimeException("잘못된 선택입니다.");
				}
			} catch(GunException e) {
				System.out.println("예외코드 : " + e.getExceptionCode());
				System.out.println("예외메시지 : " + e.getMessage());
			}
			  catch(Exception e) {
				  System.out.println("예외메시지 : " + e.getMessage());
			  }
		}		
	}
}
