package icehs.science.chapter09;

public class Dentist extends Doctor {

	public Dentist(String name) {
		super(name, "치과");
	}
	
	public void pulloutTooth() {
		System.out.println("이를 뽑습니다.");
	}
}