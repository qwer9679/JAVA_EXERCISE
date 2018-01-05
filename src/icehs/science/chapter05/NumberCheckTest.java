package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {

		int number1 = 4;
		int number2 = 5;
		int mul = number1 * number2;
		
		if(mul>100) {
			System.out.println(number1 + "*" + number2 + " : 세 자리 수 이상 입니다.");
		}
		else if(mul>10) {
			System.out.println(number1 + "*" + number2 + " : 두 자리 수 이상 입니다.");
		}
		else if(mul>0) {
			System.out.println(number1 + "*" + number2 + " : 한 자리 수 이상 입니다.");
		}
		else if(mul==0) {
			System.out.println(number1 + "*" + number2 + " : 0 입니다.");
		}
		else {
			System.out.println(number1 + "*" + number2 + " : 음수는 확인하지 않습니다.");
		}
		
		
	}

}