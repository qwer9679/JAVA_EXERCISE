package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {

		int number = 456;
		int hundNumber = number/100;
		int decNumber = (number - hundNumber*100)/10;
		int loneNumber = (number - hundNumber *100 - decNumber*10);
		
		System.out.println("100���ڸ� ���� : " + hundNumber);
		System.out.println("10���ڸ� ���� : " + decNumber);
		System.out.println("1���ڸ� ���� : " + loneNumber);
		
		
	}

}
