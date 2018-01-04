package icehs.science.chapter04;

public class salaryTest {

	public static void main(String[] args) {

		int monthSalary = 1000000;
		int bounus = monthSalary * 20 / 100 * 4;
		int yearSalary = monthSalary * 12;
		int TaxYearSalary = yearSalary * 10 / 100;
		int Taxbounus = bounus * 55/1000;
		int takeMoney = (yearSalary - TaxYearSalary) + (bounus - Taxbounus);
		
		System.out.println("연봉 : " +yearSalary + ", 세후 연봉 : " + (yearSalary - TaxYearSalary));
		System.out.println("보너스 : " +  bounus + ", 세후 보너스 :" + (bounus - Taxbounus));
		System.out.println("지급액 : " + takeMoney);
	}

}
