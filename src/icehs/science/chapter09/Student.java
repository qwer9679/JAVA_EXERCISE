package icehs.science.chapter09;

public class Student extends Person {

	private String department;
	
	public Student(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}
	
	public void eat() {
		System.out.println("������ ���� �Դ�");
	}
	
	public void study() {
		System.out.println("�����ϴ�.");
	}
}