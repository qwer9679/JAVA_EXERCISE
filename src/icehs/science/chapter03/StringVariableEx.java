package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		String MathScore = "96";
		int intMathScore = Integer.parseInt(MathScore);
		int englishScore = 82;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� ���� : " + intMathScore);
		System.out.println("���� ���� : " + englishScore);
		System.out.println("------------------------");
		System.out.println("�հ� ���� : " + intMathScore + englishScore);
		//��ȣ  X
		System.out.println("�հ� ���� : " + (intMathScore + englishScore));
		//��ȣ O
	}

}