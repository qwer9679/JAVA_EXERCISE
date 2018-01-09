package icehs.science.chapter07;

public class ItBook {

	private String title;
	private int price;
	private double discountRate;
	public ItBook(String title, int price, double discountRate) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printItBookInfo() {
		System.out.println("���� : " + title + ", ���� : " + price + "��, ������  : " + discountRate + "% , ���ΰ� : " + calculateDisPrice() + "��");
	}
	
	int calculateDisPrice() {
		int disPrice = (int)(price * (100-discountRate)/100);
		return disPrice;
	}
}