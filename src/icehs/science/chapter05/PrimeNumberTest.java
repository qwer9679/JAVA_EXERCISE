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
			System.out.println(number + "�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(number + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}