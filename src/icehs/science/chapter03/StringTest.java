package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		String king = "�������";
		String Won = "10000";
		int thisYear = 2018;
		int intWon = Integer.parseInt(Won);
		
		System.out.println(king + " : " + Won);
		System.out.println(thisYear + "��");
		System.out.println(Won + thisYear);
		System.out.println(thisYear + intWon);
	}

}