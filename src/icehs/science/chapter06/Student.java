package icehs.science.chapter06;

public class Student {
	String StuName;
	String StuId;
	int korScore;
	int engScore;
	int matScore;
	
	int avgScore;
	
	void printStudentInfo() {
		System.out.println("�л� �̸� : " + StuName);
		System.out.println("�л� ��ȣ : " + StuId);
		System.out.println("���� ���� : " + korScore);
		System.out.println("���� ���� : " + engScore);
		System.out.println("���� ���� : " + matScore);
		System.out.println("���� ���� : " + (korScore + engScore + matScore));
		System.out.println("���� ��� : " + calculateAVG());
	}
	
	int calculateAVG() {
		avgScore = (korScore + engScore + matScore)/3;
		return avgScore;
	}
	
	void changeStudentId(String newstuId){
		StuId = newstuId;
	}
}
