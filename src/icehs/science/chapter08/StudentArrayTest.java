package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student students[] = new Student[3];
		
		students[0] = new Student("강감찬", "SUT0001", "010-1234-5678");
		students[1] = new Student("이순신", "SUT0002", "010-2345-6789");
		students[2] = new Student("김유신", "SUT0003", "010-9876-5432");
		
		for(int i = 0 ; i < students.length; i++) {
			System.out.println(students[i].getName() + "(" + students[i].getId() + ")/ 전화번호 : "+ students[i].getPhone());
		}
	}
}
