package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		String king = "¼¼Á¾´ë¿Õ";
		String Won = "10000";
		int thisYear = 2018;
		int intWon = Integer.parseInt(Won);
		
		System.out.println(king + " : " + Won);
		System.out.println(thisYear + "³â");
		System.out.println(Won + thisYear);
		System.out.println(thisYear + intWon);
	}

}