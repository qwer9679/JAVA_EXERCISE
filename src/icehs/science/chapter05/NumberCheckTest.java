package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {

		int number1 = 4;
		int number2 = 5;
		int mul = number1 * number2;
		
		if(mul>100) {
			System.out.println(number1 + "*" + number2 + " : �� �ڸ� �� �̻� �Դϴ�.");
		}
		else if(mul>10) {
			System.out.println(number1 + "*" + number2 + " : �� �ڸ� �� �̻� �Դϴ�.");
		}
		else if(mul>0) {
			System.out.println(number1 + "*" + number2 + " : �� �ڸ� �� �̻� �Դϴ�.");
		}
		else if(mul==0) {
			System.out.println(number1 + "*" + number2 + " : 0 �Դϴ�.");
		}
		else {
			System.out.println(number1 + "*" + number2 + " : ������ Ȯ������ �ʽ��ϴ�.");
		}
		
		
	}

}