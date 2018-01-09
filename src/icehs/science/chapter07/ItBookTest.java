package icehs.science.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		sql.printItBookInfo();
		ItBook java = new ItBook("Java 2.0", 28000, 3.2);
		java.printItBookInfo();
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		jsp.printItBookInfo();
		System.out.println();
		
		System.out.println(sql.getTitle() + "������  �������� �����մϴ�.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printItBookInfo();
		System.out.println();
		
		System.out.println(java.getTitle() + "������ �����մϴ�.");
		sql.setDiscountRate(3.2);
		sql.printItBookInfo();
		System.out.println();
		
		System.out.println(jsp.getTitle() + "�����  �������� �����մϴ�.");
		sql.setTitle("Servlet&JSP");
		sql.setDiscountRate(12.6);
		sql.printItBookInfo();
		
	}
}