package icehs.science.chapter07;

public class ComputerTest {

	public static void main(String[] args) {
		Computer r500 = new Computer("R500", "win7", 100);
		Computer r570 = new Computer("R570", "win10", 200, 30);
		r500.printComputerInfo();
		r570.printComputerInfo();
	}
}
