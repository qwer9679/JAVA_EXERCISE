package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int totalSum = 0;
		int avgSum = 0;
		System.out.print("모임은 몇 차까지 진행돠었나요? : ");
		int timeNo = getUserInput();
		System.out.println("==============");
		System.out.println("각 차수에서 쓴 비용을 입력하세요.");
		for(int i = 1; i <= timeNo; i++) {
			System.out.print(i + "차 비용 : ");
			totalSum +=  getUserInput();
		}
		System.out.println("총 비용은 " + totalSum + "원 입니다.");
		System.out.println("============================");
		System.out.print("모임의 인원수를 입력하세요.");
		int memNo = getUserInput();
		System.out.println("============================");
		System.out.println("더치페이 금액은?");
		avgSum = totalSum/memNo;
		for(int i = 1; i <= memNo-1; i++) {
			System.out.println(i + " : " + avgSum + "원");
			totalSum -= avgSum;
			if(memNo-i==1) {
				System.out.println(i + " : " + totalSum + "원");
			}
			
		}
	}
public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}