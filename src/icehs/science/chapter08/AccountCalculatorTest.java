package icehs.science.chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		
		Account accounts[] = new Account[5];
		
		for(int i = 0 ; i < accounts.length ; i++) {
			accounts[i] = new Account("111-222-555" + (i+1) ,10000*(i+1), 4.5);
			System.out.println("���¹�ȣ : " + accounts[i].getNumber() + 
				" / �ܾ� : " + accounts[i].getBalance() + "�� / ���� : " + 
					accounts[i].getInterestRate());
		}
		System.out.println("������ �����մϴ�.");
		for(int i = 0 ; i < accounts.length ; i++) {
			accounts[i].setInterestRate(3.7);
			accounts[i].calculateInterest();
			System.out.println("���¹�ȣ : " + accounts[i].getNumber()  + 
				" / ���� : " + accounts[i].getInterestRate()+ " / �ܾ� : " + 
				accounts[i].getBalance());
		}
	}
}
