package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int A = 0;//Ȧ�� ��
		int B = 0;//¦�� ��
		
		for(int i = 0; i <=1000; i++) {
			if(i%2==1) {
				A+=i;
			}
			else {
				B+=i;
			}
			if(i==1000) {
				sum = A + B;
				System.out.println("1���� " + i + "���� �� : " + sum);
				System.out.println("1���� " + i + "���� ¦������ ��  : " + A);
				System.out.println("1���� " + i + "���� Ȧ������ �� : " + B);
			}
		}
	}
}