package exceptions;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		int a=100;
		
		try {
			System.out.println(a/0);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("apple");
		}
		}
		
		
	}


