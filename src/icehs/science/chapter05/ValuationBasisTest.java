package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {

		int firNo = 10;
		int secNo = 20;
		int thiNo = 40;
		int forNo = 50;
		int fivNo = 80;
		
		double result = 0;
		result += firNo * secNo / 2 * 6 / 10;
		result += (thiNo + forNo) / 2 * 13 / 100;
		result += fivNo * 27/ 100;
		
		System.out.println("평가 점수 : " + result);
		if (result>=95&& result<=100) {
			System.out.println("Special Class입니다.");
		}
		else if(result>=90) {
			System.out.println("Gold Class입니다.");
		}
		else if(result>=85) {
			System.out.println("Silver Class입니다.");
		}
		else if(result>=80) {
			System.out.println("Bronze Class입니다.");
		}
	}

}