package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		
		FundAccount fundAcc1 = new FundAccount("111-2222", "홍길동", 5000000, 4.7);
		FundAccount fundAcc2 = new FundAccount("666-7777", "홍길순", 1000000, 2.9);
		System.out.println("계좌를 개설합니다.");
		fundAcc1.openAccount();
		fundAcc1.earnMoney();
		System.out.println();
		/*System.out.println("계좌번호 : " + fundAcc.getNumber());
		System.out.println("예금주 : " + fundAcc.getName());
		System.out.println("잔액 : " + fundAcc.getBalance());
		System.out.println("수익률 : " + fundAcc.getEarningRate());*/
		fundAcc2.openAccount();
		fundAcc2.earnMoney();
		
	}
}