package icehs.science.chapter04;

public class salaryTest {

	public static void main(String[] args) {

		int monthSalary = 1000000;
		int bounus = monthSalary * 20 / 100 * 4;
		int yearSalary = monthSalary * 12;
		int TaxYearSalary = yearSalary * 10 / 100;
		int Taxbounus = bounus * 55/1000;
		int takeMoney = (yearSalary - TaxYearSalary) + (bounus - Taxbounus);
		
		System.out.println("���� : " +yearSalary + ", ���� ���� : " + (yearSalary - TaxYearSalary));
		System.out.println("���ʽ� : " +  bounus + ", ���� ���ʽ� :" + (bounus - Taxbounus));
		System.out.println("���޾� : " + takeMoney);
	}

}
