package icehs.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {

		Chocolate choco1 = new Chocolate();
		choco1.name = "�Ƹ�����";
		choco1.type = "��ũ";
		choco1.price = 2200;
		choco1.printChocolateInfo();
		
		String chocoName = choco1.getName();
		int totalPrice = choco1.calculatetotalPrice(20);
		
		System.out.println(chocoName + " ���ݷ� 20���� ���� : " + totalPrice);
		choco1.changeChocolateInfo("�⸮��",2500);
		int newTotalPrice = choco1.calculatetotalPrice(15, 10);
		System.out.println(choco1.name + " ���ݷ� 15�� (10% ����) : " + totalPrice);
		choco1.changeChocolateInfo("Ʈ���� �Ҷ�", "ȭ��Ʈ", 2300);
	}

}
