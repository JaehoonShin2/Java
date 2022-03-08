package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;


public class ParkingTowerView {

	Scanner sc = new Scanner(System.in);
	ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		
		while (true) {
			menu();
			System.out.print("원하는 기능을 입력하세요 : ");
			int input = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			switch(input) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 입력입니다.");
			}

			System.out.println();
			
		}
	}
	
	private void menu() {
		System.out.println("V 메뉴 구성");
		System.out.println("1. 차량 주차");
		System.out.println("2. 차량 출차");
		System.out.println("3. 주차된 차량 검색");
		System.out.println("4. 전체 출력");
		System.out.println("0. 프로그램 종료하기");
	};

	
	public void insertCar() {
		System.out.println("-- 1. 차량 주차 --");
		System.out.print("차량 번호를 입력하세요 : ");
		int carNum = sc.nextInt();
		System.out.print("차량 타입을 입력하세요 : ");
		int carType = 9999999;
		while (carType > 4) {
			carType = sc.nextInt();
			if (carType > 4) {
				System.out.println("잘못된 입력입니다.");
				System.out.print("차량 타입을 입력하세요 : ");
			}	
		}
		sc.nextLine();
		System.out.print("차주를 입력하세요 : ");
		String owner = sc.nextLine();
		
		ptc.insertCar(carNum, carType, owner);
		System.out.println("저장이 완료되었습니다.");
	};
	
	public void deleteCar() {
		System.out.println("-- 2. 차량 출차 --");
		System.out.print("삭제할 차량 번호를 입력하세요 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		int result = ptc.deleteCar(carNum);
		System.out.printf("총 %d건 출차 완료되었습니다.\n", result);
	};
	
	public void searchCar() {
		System.out.println("-- 3. 주차된 차량 검색 --");
		System.out.print("검색할 차주 이름을 입력하세요 : ");
		String name = sc.nextLine();
		ArrayList<Car> searchList = ptc.searchCar(name);
		if (searchList.isEmpty()) { 
			System.out.println("검색한 차주의 차량이 존재하지 않습니다.");
		}else { 
			System.out.printf("조회한 차주의 차량은 총 %d대입니다.\n", searchList.size());
			searchList.forEach(System.out::println);
		}
	};
	
	public void selectList() {
		System.out.println("-- 4. 전체 출력 --");
		System.out.println("전체 목록 출력합니다.");
		if (ptc.selectList().isEmpty()) { 
			System.out.println("검색한 차주의 차량이 존재하지 않습니다.");
		}else {
			System.out.printf("현재 주차된 차량은 총 %d대 입니다.\n", ptc.selectList().size());
			ptc.selectList().forEach(System.out::println);
		}
	};
}
