package exceptions;

public class Excep {
	public static void main(String[] args) {

		int a = 10;

//		try {
//			System.out.println(a / 0);
//
//		} catch (Exception e) {
//			System.out.println("abi");
//			e.printStackTrace();
//			
//
//		}
//
//		System.out.println("java");
//		try {
//			System.out.println(a / 0);
//		} finally {
//			System.out.println("java");
//		}
//		
//		System.out.println("java");

		try {
			System.out.println(a / 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("levista");
		}
	}

}
