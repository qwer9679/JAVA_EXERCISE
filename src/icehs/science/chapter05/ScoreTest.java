package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	private static Scanner sc;
	public static void main(String[] args) {
		int stdNo;
		int sumScore = 0;
		int stdSc=0;
		double avgSc = 0;
		System.out.print("���� �л� ����? : ");
		int a = getUserInput();
		stdNo=a;
		for(int i = 1 ; i <= stdNo ; i ++) {
			System.out.print( i + "��° �л��� ������? : ");
			int b = getUserInput();
			sumScore+=b;
		}
		avgSc = (double)sumScore/stdNo;
		System.out.println(stdNo + "���� �� ���� : " + sumScore);
		System.out.println(stdNo + "���� ��� : " + avgSc);
		}
		public static int getUserInput() {
			sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        return input;
	   }
}