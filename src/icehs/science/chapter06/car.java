package icehs.science.chapter06;

public class car {

	String ICE;
	double driveDistance;
	int oilAmount;
	
	void addOil(int newOilAmount) {
		System.out.println("�ֹ��� " + newOilAmount + " L �����մϴ�.");
		oilAmount += newOilAmount;
	}
	
	void driveCar(String start, String end, double distance) {
		System.out.println(start + "���� " + end + "���� " + distance + "km �����Ͽ����ϴ�.");
		oilAmount =(int)(oilAmount -  distance/20);
		driveDistance += distance;
	}
	void carInfo() {
		System.out.println("[ICE ī] ���� �⸧ �� : " + oilAmount + "L, �� ����Ÿ� : " + driveDistance + "km");
	}
	double calculateDrivingDistance() {
		double distance = 0.0;
		distance += driveDistance;
		return distance;
	}
}
