package keywords;

public class This_Super_Concepts_2 extends This_Super_Concepts_1 {

	int a = 25;

	public  void release() {
		//this - current class reference
		System.out.println(this.a);
		//super - parent class reference
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		This_Super_Concepts_2 ts2 = new This_Super_Concepts_2();
		ts2.release();
	}
}
