package icehs.science.chapter06;

public class Building {
	String name ;
	String address ;
	int totalfloor;
	
	void moveElevator() {
		System.out.println("���������͸� �����մϴ�.");
	}
	
	void changeAddress(String newAddress) {
		address = newAddress;
	}
}