package icehs.science.chapter10.animals;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal1 = new Bird("������", 3, "������");
		System.out.println(animal1.getKind() + "(" + animal1.getAge() + "��) : " + ((Bird)animal1).getHabitat());
		((Bird)animal1).spreadWings();
		((Bird)animal1).fly();
		
	}
}
