package icehs.science.chapter09;

public class InherTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student("�Ӳ���", "1234-5678","�İ���");
		Teacher t1 = new Teacher("����", "4444-7777", "����");
		
		//p1.eat();
		//s1.eat();
		t1.eat();
		
		s1.study();
		t1.Teach();
	}
}