package icehs.science.chapter07;

public class MagazineTest {

	public static void main(String[] args) {
		Magazine mag1 = new Magazine("Maxim", 15000);
		/*mag1.name = "XXX"
		mag1.price =5000;*/
		mag1.setName("�Ѹ���������");
		mag1.setPrice(5000);
		mag1.printProductInfo();
		
		Magazine mag2 = new Magazine("Cosmopolitan", 30000);
		String title = mag2.getname();
		int price = mag2.getPrice();
		System.out.println(title + " : " + price);
	}
}
