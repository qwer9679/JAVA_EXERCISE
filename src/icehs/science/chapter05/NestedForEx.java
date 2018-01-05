package icehs.science.chapter05;

public class NestedForEx {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=9; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
		System.out.println();
		}
	}
}