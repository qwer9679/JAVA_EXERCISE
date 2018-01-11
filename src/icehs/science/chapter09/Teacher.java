package icehs.science.chapter09;

public class Teacher extends Person {

	private String subject;
	
	public Teacher(String name,String phone, String subjcet) {
		super(name, phone);
		this.subject = subject;
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("ÇÔ²² ¹äÀ» ¸Ô´Ù");
	}
	
	public void Teach() {
		System.out.println("°¡¸£Ä¡´Ù.");
	}
}