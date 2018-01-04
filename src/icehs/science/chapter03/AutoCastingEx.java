package icehs.science.chapter03;

public class AutoCastingEx {

	public static void main(String[] args) {
		
		int number = 1000;
		long longNumber = number;
		double doubleNumber = longNumber;
		
		System.out.println(number);
		System.out.println(longNumber);
		System.out.println(doubleNumber);
		
		double BigNumber = 100000000000000004865.36;
		long LongNumber = (long)BigNumber;
		int Number = (int)BigNumber;
		
		System.out.println(BigNumber);
		System.out.println(LongNumber);
		System.out.println(Number);

	}

}