package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
	
		Coffee americano = new Coffee();
		Coffee latte = new Coffee();
		Coffee makiatto = new Coffee();
		
		americano.name = "¾Æ¸Þ¸®Ä«³ë";
		latte.name = "¶ó¶¼";
		makiatto.name = "¸¶³¢¾Æ¶Ç";
		
		americano.price = 3500;
		latte.price = 4000;
		makiatto.price = 4500;
		
		americano.printCoffeeInfo();
		latte.printCoffeeInfo();
		makiatto.printCoffeeInfo();
		
		int totalPrice;
		totalPrice = americano.price + latte.price + makiatto.price;
		System.out.println("ÃÑ ±Ý¾× : " + totalPrice + "¿ø");
	}
}
