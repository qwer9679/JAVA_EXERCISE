package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student students[] = new Student[3];
		
		students[0] = new Student("������", "SUT0001", "010-1234-5678");
		students[1] = new Student("�̼���", "SUT0002", "010-2345-6789");
		students[2] = new Student("������", "SUT0003", "010-9876-5432");
		
		for(int i = 0 ; i < students.length; i++) {
			System.out.println(students[i].getName() + "(" + students[i].getId() + ")/ ��ȭ��ȣ : "+ students[i].getPhone());
		}
	}
}
