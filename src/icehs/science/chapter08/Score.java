package icehs.science.chapter08;

public class Score {
	String [] subject;
	int [] scores = new int[3];
	
	Score(){
		String[] subject = new String[3];
		subject[0] = "����";
		subject[1] = "����";
		subject[2] = "����";
	}
	
	void printSubject() {
		for(int i = 0; i<3; i++) {
			System.out.println(subject[i]);
		}
	}
	
	void printScore() {
		for(int i = 0; i<3; i++) {
			System.out.println(scores[i]);
		}
	}
	int calcAVG() {
		return (scores[0] + scores[1] + scores[2])/3;
	}
}
