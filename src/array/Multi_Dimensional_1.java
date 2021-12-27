package array;

public class Multi_Dimensional_1 {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		// data in multi dimension are stored in tabular form(in row major order)
		a[0][0] = 10;
		a[1][1] = 20;
		a[1][0] = 30;
		a[0][1] = 40;
// so from below program we can identify that
//we can store nested for loop value in multi dim array
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				 System.out.print(a[i][j] + " ");
			}
			// this below line is used to print in matrix type
			System.out.println();
		}
		
	}

}
