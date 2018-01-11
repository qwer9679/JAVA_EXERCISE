package icehs.science.chapter08;

public class Chocolate {
	
	private String name;
	private String type;
	private int price;
	
	

	public Chocolate(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getName() { 
		return name;
	}
	
	int calculatetotalPrice(int count) {
		return count * price;
	}
	
	int calculatetotalPrice(int count, int discount) {
		
		return count * price * (100-discount)/100;
	}
	
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	
	void changeChocolateInfo(String newName,String newType, int newPrice) {
		name = newName;
		price = newPrice;
		type = newType;
		printChocolateInfo();
	}
	
	void printChocolateInfo() {
		System.out.println("�̸� : " + name + " , ����  : " + type  + " , ���� : " + price);
	}
	
}
