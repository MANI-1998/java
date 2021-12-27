package jumping_statement;

public class Jumping_Statement_4 {
	
	public static void main(String[] args) {	
		
		for (int i = 0; i < 25; i++) {
			if (i==5) {
				continue;
			}
			if(i==10 || i==14 ||i==15) {
				continue;
			}
			if (i==15 && i==16) {
				break;
			}
			if (i==18) {
				continue;
			}
			if (i==22) {
				continue;
			}
		
		System.out.println(i);
		}	
	}

}
