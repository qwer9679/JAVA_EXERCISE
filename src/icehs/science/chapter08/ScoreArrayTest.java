package icehs.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int scores [] = {93, 87, 90};
		String subjects[] = {"����", "����", "����"};
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i] + " : " + scores[i]);
		}
		avg = (double)sum/3;
		/*System.out.println("���� : " + scores[0]);
		System.out.println("���� : " + scores[1]);
		System.out.println("���� : " + scores[2]);*/
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}
}
