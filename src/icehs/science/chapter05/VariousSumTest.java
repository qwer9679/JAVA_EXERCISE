package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int A = 0;//홀수 합
		int B = 0;//짝수 합
		
		for(int i = 0; i <=1000; i++) {
			if(i%2==1) {
				A+=i;
			}
			else {
				B+=i;
			}
			if(i==1000) {
				sum = A + B;
				System.out.println("1부터 " + i + "까지 합 : " + sum);
				System.out.println("1부터 " + i + "까지 짝수들의 합  : " + A);
				System.out.println("1부터 " + i + "까지 홀수들의 합 : " + B);
			}
		}
	}
}