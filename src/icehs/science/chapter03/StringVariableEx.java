package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {

		String name = "홍길동";
		String MathScore = "96";
		int intMathScore = Integer.parseInt(MathScore);
		int englishScore = 82;
		
		System.out.println("이름 : " + name);
		System.out.println("수학 점수 : " + intMathScore);
		System.out.println("영어 점수 : " + englishScore);
		System.out.println("------------------------");
		System.out.println("합계 점수 : " + intMathScore + englishScore);
		//괄호  X
		System.out.println("합계 점수 : " + (intMathScore + englishScore));
		//괄호 O
	}

}