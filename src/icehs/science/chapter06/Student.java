package icehs.science.chapter06;

public class Student {
	String StuName;
	String StuId;
	int korScore;
	int engScore;
	int matScore;
	
	int avgScore;
	
	void printStudentInfo() {
		System.out.println("학생 이름 : " + StuName);
		System.out.println("학생 번호 : " + StuId);
		System.out.println("국어 성적 : " + korScore);
		System.out.println("영어 성적 : " + engScore);
		System.out.println("수학 성적 : " + matScore);
		System.out.println("성적 총점 : " + (korScore + engScore + matScore));
		System.out.println("성적 평균 : " + calculateAVG());
	}
	
	int calculateAVG() {
		avgScore = (korScore + engScore + matScore)/3;
		return avgScore;
	}
	
	void changeStudentId(String newstuId){
		StuId = newstuId;
	}
}
