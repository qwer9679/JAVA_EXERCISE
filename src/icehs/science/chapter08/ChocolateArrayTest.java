package icehs.science.chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		
		/*Chocolate chocos[] = new Chocolate[3];
		chocos[0] = new Chocolate("아마도라", "다크" , 2200);
		chocos[1] = new Chocolate("카페 기리쉬", "다크" , 2500);
		chocos[2] = new Chocolate("트리플 블랑", "화이트" , 2300);*/
		

		for(Chocolate chocos[] = {new Chocolate("아마도라", "다크", 2200),
				new Chocolate("다크 기리쉬", "다크", 2500),
				new Chocolate("트리플 블랑", "화이트", 2300)};
				
				chocos[0].printChocolateInfo();
				chocos[1].printChocolateInfo();
				chocos[2].printChocolateInfo();
	}
}