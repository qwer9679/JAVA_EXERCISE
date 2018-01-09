package icehs.science.chapter07;

public class Student {
	public static int STUDENT_NO = 0;
	
	private String stu_name;
	private String stu_no;
	private int grade;
	public Student(String stu_name, String stu_no) {
		super();
		this.stu_name = stu_name;
		this.stu_no = stu_no;
		STUDENT_NO++;
		
	}
	public Student(String stu_name, String stu_no, int grade) {
		super();
		this.stu_name = stu_name;
		this.stu_no = stu_no;
		this.grade = grade;
		STUDENT_NO++;
	}
}
