package icehs.science.chapter07;

public class Television {

	String name;
	String description;
	int price;
	
	Television(){
		
	}
	Television(String name, int price){
		this.name = name;
		this.price = price;
	}
	Television(String name, String description, int price){
		this(name, price);
		this.description = description;
	}
	void printTelevisionInfo(){
		if(description == null) {
			System.out.println(name + " : " + price);
		}
		else {
			System.out.println(name + "(" + description + ") : " + price);
		}
	}
}