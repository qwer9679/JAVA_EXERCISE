package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		
		FundAccount fundAcc1 = new FundAccount("111-2222", "ȫ�浿", 5000000, 4.7);
		FundAccount fundAcc2 = new FundAccount("666-7777", "ȫ���", 1000000, 2.9);
		System.out.println("���¸� �����մϴ�.");
		fundAcc1.openAccount();
		fundAcc1.earnMoney();
		System.out.println();
		/*System.out.println("���¹�ȣ : " + fundAcc.getNumber());
		System.out.println("������ : " + fundAcc.getName());
		System.out.println("�ܾ� : " + fundAcc.getBalance());
		System.out.println("���ͷ� : " + fundAcc.getEarningRate());*/
		fundAcc2.openAccount();
		fundAcc2.earnMoney();
		
	}
}