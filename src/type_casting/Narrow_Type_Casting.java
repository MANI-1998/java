package type_casting;
//convert a value from one data type to another data type

public class Narrow_Type_Casting {//high to low
	
	public static void main(String[] args) {
		
		short a = 123;
		byte b=(byte)a;
		
		long c=9943039L;
		int d = (int)c;
		
		
		double e = 123.23456789;
		float f = (float)e;
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		
		
	}

}
