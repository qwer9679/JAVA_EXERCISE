package icehs.science.chapter07;

public class StudentTest {

	public static void main(String[] args) {
		
		System.out.println("�����л��� : " + Student.STUDENT_NO);
		
		Student stu1 = new Student("ȫ�浿", "STU001", 4);
		Student stu2 = new Student("ȫ����", "STU002", 1);
		Student stu3 = new Student("ȫ����", "STU003", 2);
		Student stu4 = new Student("ȫ���", "STU004", 3);
		
		System.out.println("�����л��� : " + Student.STUDENT_NO);
		stu1.STUDENT_NO++;
		System.out.println("�����л��� : " + stu1.STUDENT_NO);
		System.out.println("�����л��� : " + stu2.STUDENT_NO);
		
	}
}