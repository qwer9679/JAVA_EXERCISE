
public class SumAndAverageTest {

	public static void main(String[] args) {
		
		int sum=0;
		for(int a = 0 ; a <= 500 ;a++) {
			sum+=a;
			
		}
		double aver = (double)sum/500;
		System.out.println("�հ� : " +sum);
		System.out.println("��� : "+(aver));
		
	}
}
