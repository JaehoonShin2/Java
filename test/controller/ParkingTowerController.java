package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {

	ArrayList<Car> carList = new ArrayList<Car>(); 
	
	
	public void insertCar(int carNum,
			int carType, String owner) {
		int ParkingNum = 1;
		while (true) {
			boolean flag = false;
			for (int i = 0; i < carList.size(); i++) {
				
				if (carList.get(i).getParkingNum() == ParkingNum ) {
					flag = true;
					break;
				}
			}
			if (flag) {
				ParkingNum++;
			} else {
				break;
			}
		}
		
		carList.add(new Car(ParkingNum, carNum, carType, owner));
	};
	
	
	public int deleteCar(int carNum) {
		int deletecount = 0;
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				deletecount++;
			}
		}
		return deletecount;
	};
	
	
	public ArrayList<Car> searchCar(String owner){
		ArrayList<Car> searchList = new ArrayList<Car>();
		// 차주 이름으로 검색.
		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getOwner().equals(owner)) {
				searchList.add(carList.get(i));
			}
			
		}
		return searchList;
		
	};
	
	
	public ArrayList<Car> selectList(){
		return carList;
	};
	
	
}
