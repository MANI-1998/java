package exceptions;

public class Try_Catch {
	//we cannot use try alone
	//it should be used with catch or finally
	public static void main(String[] args) {
		
		int a =10;
		//the below syso is error only
		//but by using try and catch i had try and catch the exception
		//so the coffee is printed in the console
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			//if we want to know the mistake
			//we can see it in the console for that only exception e is given above automatically
			//the below line is used to find the mistake
			e.printStackTrace();
		}
		
		System.out.println("coffee");
	}

}
