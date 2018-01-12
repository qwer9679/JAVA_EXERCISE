package icehs.science.chapter10.animals;

public class Bird extends Animal implements Flyable{
	
	private String habitat;
	
	
	public Bird(String kind , int age, String habitat) {
		super(kind, age);
		this.habitat = habitat;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	
}
