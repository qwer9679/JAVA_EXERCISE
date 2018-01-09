package icehs.science.chapter07;

public class Publication {

	private String title;
	private int price;
	private int page;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("[����]���� ������ ������ �Է��� �� �����ϴ�!!");
		}
		else {
			
			this.price = price;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPage(int page) {
		if(page<0) {
			System.out.println("[����]������ ������ ������ �Է��� �� �����ϴ�!!");
		}
		else {
			this.page = page;
		}
	}
	
	public int getPage() {
		return page;
	}
	public static void printHEader() {
		System.out.println("======================����������ȸ=======================");
	}
}