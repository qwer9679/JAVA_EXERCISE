package icehs.science.chapter10.mobiles;

public class Mobile {
	
	private String production;
	private int price;
	
	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void call(int time) {
		System.out.println(time + "�� ��ȭ�߽��ϴ�.");
	}
	
	public void charge(int time) {
		System.out.println(time + "�� �����߽��ϴ�.");
		
	}
}
