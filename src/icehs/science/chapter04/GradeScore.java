package icehs.science.chapter04;

public class GradeScore {

	public static void main(String[] args) {

		int Score = 75;
		boolean result1 = Score <=100 && Score >=90;
		System.out.println("A학점 : " + result1);
		
		boolean result2 = Score <90 && Score >=80;
		System.out.println("B학점 : " + result2);
		
		boolean result3 = Score <80 && Score >=70;
		System.out.println("C학점 : " + result3);
		
		boolean result4 = Score <70 && Score >=60;
		System.out.println("D학점 : " + result4);
		
	}

}
