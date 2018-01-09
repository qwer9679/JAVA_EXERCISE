package icehs.science.chapter06;

public class car {

	String ICE;
	double driveDistance;
	int oilAmount;
	
	void addOil(int newOilAmount) {
		System.out.println("휘발유 " + newOilAmount + " L 주유합니다.");
		oilAmount += newOilAmount;
	}
	
	void driveCar(String start, String end, double distance) {
		System.out.println(start + "에서 " + end + "까지 " + distance + "km 주행하였습니다.");
		oilAmount =(int)(oilAmount -  distance/20);
		driveDistance += distance;
	}
	void carInfo() {
		System.out.println("[ICE 카] 남은 기름 양 : " + oilAmount + "L, 총 주행거리 : " + driveDistance + "km");
	}
	double calculateDrivingDistance() {
		double distance = 0.0;
		distance += driveDistance;
		return distance;
	}
}
