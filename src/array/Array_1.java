package array;

public class Array_1 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double sum = 0;
		
		System.out.println(a.length);
		
		for (int i : a) {
			
			sum = sum + i;
			
		}
		
		double average = sum/a.length;
		
		System.out.println(average);
	}
}
