package icehs.science.chapter08;

public class OddEvenSumTest {

	public static void main(String[] args) {
		int data[] = {12,53,24,10,22,38,64,39};
		int oddSum = 0;
		int evenSum = 0;
		
		System.out.print("�迭 ������ : ");
		for(int i = 0 ; i < data.length ; i++) {
			if(i%2 == 0) {
				oddSum += data[i];
			}
			else {
				evenSum += data[i];
			}
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("Ȧ�� ��° ������ �� :" + evenSum);
		System.out.println("¦�� ��° ������ �� :" + oddSum);
		
	}
}