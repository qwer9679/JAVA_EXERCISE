package icehs.science.chapter05;

public class SumTest {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int a=1;a<=100;a++) {
			sum += a;
			if(a==100) {
				System.out.println(sum);
			}
		}
	}
}