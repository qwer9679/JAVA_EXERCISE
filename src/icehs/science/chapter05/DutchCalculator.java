package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int totalSum = 0;
		int avgSum = 0;
		System.out.print("������ �� ������ ����¾�����? : ");
		int timeNo = getUserInput();
		System.out.println("==============");
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		for(int i = 1; i <= timeNo; i++) {
			System.out.print(i + "�� ��� : ");
			totalSum +=  getUserInput();
		}
		System.out.println("�� ����� " + totalSum + "�� �Դϴ�.");
		System.out.println("============================");
		System.out.print("������ �ο����� �Է��ϼ���.");
		int memNo = getUserInput();
		System.out.println("============================");
		System.out.println("��ġ���� �ݾ���?");
		avgSum = totalSum/memNo;
		for(int i = 1; i <= memNo-1; i++) {
			System.out.println(i + " : " + avgSum + "��");
			totalSum -= avgSum;
			if(memNo-i==1) {
				System.out.println(i + " : " + totalSum + "��");
			}
			
		}
	}
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}