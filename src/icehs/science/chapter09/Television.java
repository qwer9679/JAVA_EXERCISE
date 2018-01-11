package icehs.science.chapter09;

public class Television extends Product {

	private String Description;
	
	public Television(String name, int price, int discountRate, String description) {
		super(name, price, discountRate);
		this.Description = description;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
}
