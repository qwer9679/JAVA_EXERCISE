package icehs.science.chapter08;

public class BookArrayTest {

	public static void main(String[] args) {
		Book books[] = {new Book("������ ��", 19000),
				new Book("������", 13000),
				new Book("7�� ��", 15000)
				};
		int sum = 0;
		for(int i = 0 ; i< books.length ; i++) {
			System.out.println(books[i].getTitle() + " : " + books[i].getPrice());
			sum += books[i].getPrice();
		}
		System.out.println("å�� �հ� : " + sum + "��");
	}
}
