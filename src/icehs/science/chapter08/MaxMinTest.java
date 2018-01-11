package icehs.science.chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int data[] = {12,53,24,10,22,38,64,39};
		int max = data[0];
		int min = data[0];
		
		System.out.print("배열 데이터 : ");
		
		for(int i = 0 ; i < data.length ; i++) {
			if(data[i]>max) {
				max = data[i];
			}
			if(data[i]<min) {
				min = data[i];
			}
			if(i<data.length-1) {
				System.out.print(data[i] + ", ");
			}
			else {
				System.out.println(data[i]);	
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	
	}
}
