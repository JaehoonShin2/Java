package com.kh.model.vo;

import java.lang.invoke.SwitchPoint;

public class Car {

	
	//
	private int parkingNum, carNum, carType;
	private String owner;
	
	
	
	//
	public Car() {
		super();
	}
	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	
	
	//
	@Override
	public String toString() {
		
		String cType = "";
		if (carType == 1) {
			cType = "경차";
		} else if (carType == 2) {
			cType = "세단";
		} else if (carType == 3) {
			cType = "SUV";
		} else if (carType == 4) {
			cType = "트럭";
		}
		
		
		return "parkingNum = " + parkingNum + ", carNum = " + 
				carNum + ", carType = " + cType + ", owner = " + owner;
	}
	

	
	public int getParkingNum() {
		return parkingNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public int getCarType() {
		return carType;
	}
	public String getOwner() {
		return owner;
	}
	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	
}
