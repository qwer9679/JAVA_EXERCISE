package icehs.science.chapter10.mobiles;

public class IPhone extends Mobile{
	
	private String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void charge(int time) {
		System.out.println("iPhone : " + time + "�� �����ߴ��� Full!!!");
	}

}
