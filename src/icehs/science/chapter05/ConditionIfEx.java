package icehs.science.chapter05;

public class ConditionIfEx {

	public static void main(String[] args) {

		int age = 25;
		
		if (age>=19) {
			System.out.println("�����Դϴ�.");
			System.out.println("�����ϼ���.");
		}
		if (age<19) {
			System.out.println("19�� �̻� ���尡���մϴ�.");
			System.out.println("�˼��մϴ�.");
		}
		
		if (age>=19) {
			System.out.println("�����Դϴ�.");
			System.out.println("�����ϼ���.");
		}
		else {
			System.out.println("19�� �̻� ���尡���մϴ�.");
			System.out.println("�˼��մϴ�.");
		}
	}
}