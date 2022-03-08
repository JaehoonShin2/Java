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
			System.out.print("���ϴ� ����� �Է��ϼ��� : ");
			int input = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			switch(input) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��� �Է��Դϴ�.");
			}

			System.out.println();
			
		}
	}
	
	private void menu() {
		System.out.println("V �޴� ����");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ������ ���� �˻�");
		System.out.println("4. ��ü ���");
		System.out.println("0. ���α׷� �����ϱ�");
	};

	
	public void insertCar() {
		System.out.println("-- 1. ���� ���� --");
		System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
		int carNum = sc.nextInt();
		System.out.print("���� Ÿ���� �Է��ϼ��� : ");
		int carType = 9999999;
		while (carType > 4) {
			carType = sc.nextInt();
			if (carType > 4) {
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.print("���� Ÿ���� �Է��ϼ��� : ");
			}	
		}
		sc.nextLine();
		System.out.print("���ָ� �Է��ϼ��� : ");
		String owner = sc.nextLine();
		
		ptc.insertCar(carNum, carType, owner);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	};
	
	public void deleteCar() {
		System.out.println("-- 2. ���� ���� --");
		System.out.print("������ ���� ��ȣ�� �Է��ϼ��� : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		int result = ptc.deleteCar(carNum);
		System.out.printf("�� %d�� ���� �Ϸ�Ǿ����ϴ�.\n", result);
	};
	
	public void searchCar() {
		System.out.println("-- 3. ������ ���� �˻� --");
		System.out.print("�˻��� ���� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		ArrayList<Car> searchList = ptc.searchCar(name);
		if (searchList.isEmpty()) { 
			System.out.println("�˻��� ������ ������ �������� �ʽ��ϴ�.");
		}else { 
			System.out.printf("��ȸ�� ������ ������ �� %d���Դϴ�.\n", searchList.size());
			searchList.forEach(System.out::println);
		}
	};
	
	public void selectList() {
		System.out.println("-- 4. ��ü ��� --");
		System.out.println("��ü ��� ����մϴ�.");
		if (ptc.selectList().isEmpty()) { 
			System.out.println("�˻��� ������ ������ �������� �ʽ��ϴ�.");
		}else {
			System.out.printf("���� ������ ������ �� %d�� �Դϴ�.\n", ptc.selectList().size());
			ptc.selectList().forEach(System.out::println);
		}
	};
}
