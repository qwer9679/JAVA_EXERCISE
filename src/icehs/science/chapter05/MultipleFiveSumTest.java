package icehs.science.chapter05;

public class MultipleFiveSumTest {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(sum<100) {
			i++;
			sum+= i*5;
			System.out.println(i + " : " + "( + " + (i*5) + " ) " +  sum);
		}
	}
}