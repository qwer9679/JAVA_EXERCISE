package icehs.science.chapter05;

public class ConditionSumTest {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int a=1;a<=30;a++) {
			if(!(a%2==0)&&!(a%3==0)) {
				sum += a;
			}
		}
		System.out.println(sum);
	}
}