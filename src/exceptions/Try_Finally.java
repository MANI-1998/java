package exceptions;

public class Try_Finally {
	//we cannot use try alone
	//it should be used with catch or finally
	public static void main(String[] args) {
		//when the exception program run or not the finally block
		//will run automatically
		int a =25;
		try {
			System.out.println(a/0);
		} finally  {
			
			System.out.println("coffee");
		}
		
	}
	
	
	
	

}
