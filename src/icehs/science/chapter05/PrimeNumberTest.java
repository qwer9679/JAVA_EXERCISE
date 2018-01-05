package icehs.science.chapter05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		int number = 21;
		int a=0;
		for(int i = 2; i<number; i++) {
			if(number%i==0) {
				++a;
			}
		}
		if(a==0) {
			System.out.println(number + "는 소수입니다.");
		}
		else {
			System.out.println(number + "는 소수가 아닙니다.");
		}
	}
}