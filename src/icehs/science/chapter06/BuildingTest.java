package icehs.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building build1 = new Building();
		build1.name = "������Ÿ��";
		build1.address = "���";
		build1.totalfloor = 5;
		
		System.out.println("�ǹ��� : " + build1.name);
		System.out.println("�ּ� : " + build1.address);
		System.out.println("���� : " + build1.totalfloor);
		build1.moveElevator();
		System.out.println("===============");
		System.out.println("          ���� ��");
		System.out.println("===============");
		build1.changeAddress("������");
		System.out.println("�ǹ��� : " + build1.name);
		System.out.println("�ּ� : " + build1.address);
		System.out.println("���� : " + build1.totalfloor);
	}
}
