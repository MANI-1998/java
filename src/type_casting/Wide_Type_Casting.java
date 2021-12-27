package type_casting;

//convert a value from one data type to another data type

public class Wide_Type_Casting{//low to high
	
	public static void main(String[] args) {
		//the below program is possible
		//bcoz we are storing the values of low bit  to high bit
		
		
		//byte size 1 memory 8 bit
		byte a=10;
		//short size 2 memory 16 bit
		short b=a;
		System.out.println(b);
		
		
		//int size 4 memory 32 bit
		int c=123456;
		//long size 8 memory 64 bit
		long d=c;
		System.out.println(d);
		
		
		//float size 4 memory 32 bit
		float e=12.40f;
		//double size 8 memory 64 bit
		double f=e;
		System.out.println(f);
		
	}
	
	
	
	
	
	
	
	
}