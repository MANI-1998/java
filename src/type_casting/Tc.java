package type_casting;

public class Tc {
	public static void main(String[] args) {
		
		//widening type casting
		
		byte a=10;
		int b=a;
		System.out.println(b);
		
		short c=5;
		long d=c;
		System.out.println(d);
		
		float e =1.2f;
		double f=e;
		System.out.println(f);
		
		//narrowing type casting
		
		long a1=2050l;
		int b1=(int) a1;
		System.out.println(b1);
		
		double c1=20.12345;
		float d1=(float) c1;
		System.out.println(d1);
		
		short q = 12345;
		byte w =(byte) q;
		System.out.println(w);
	}

}
