package jumping_statement;

public class Jumping_Statement_3 {
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {

			if (i == 15 && i == 25) {

				continue;

			}

			System.out.println(i);
		}
		System.out.println("--------------------------");
		for (int j = 0; j < 30; j++) {
			if (j == 15 || j == 25) {

				continue;

			}
			System.out.println(j);

		}
	}

}
