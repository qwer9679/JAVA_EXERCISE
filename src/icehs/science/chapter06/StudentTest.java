package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.StuName = "ȫ�浿";
		hong.StuId = "Stu001";
		hong.korScore = 94;
		hong.engScore = 80;
		hong.matScore = 89;
		
		hong.printStudentInfo();
		
		System.out.println("�й� ����");
		hong.changeStudentId("STU0001");
		
		hong.printStudentInfo();
	}
}