package icehs.science.chapter10;

public class Truck extends Car{

	private int maxWeight;

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("Ʈ���� Ÿ�� " + distance + "km�� �̵��մϴ�.");
		System.out.println("���� : " + this.getOilSize());
	}
	
	public void wash() {
		System.out.println("�ý� : �����մϴ�.");
	}
}