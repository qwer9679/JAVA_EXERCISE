package icehs.science.chapter06;

public class Account {
	
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		System.out.println(money + "���� �Ա��մϴ�.");
		if(money>=0) {
		balance += money;
		System.out.println("�ܾ� : " + balance + "��");
		}
		else {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�.");
		}
	}
	
	void withdraw(int money) {
		System.out.println(money + "���� ����մϴ�.");
		if(money<0) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else if(balance>money) {
			balance -= money;
			System.out.println("�ܾ� : " + balance + "��");
		}
		else {
			System.out.println("[����]�ܾ��� �����մϴ�.");
		}
	}
	void printaccountInf() {
		System.out.println("���� : " + accNo + " ( ������ : " + accName + " )");
		System.out.println("�ܾ� : " + balance);
	}
}
