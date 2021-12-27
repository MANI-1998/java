package method_overriding;

public class Child extends Parent{

	@Override
	public void property() {
		System.out.println("pizza");
		//super.property();
	}
	
	@Override
	public void property(int a) {
		
		super.property(a);
	}
	@Override
	public void property(String b) {
		
		super.property(b);
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.property();
		ch.property(123456);
		ch.property("he");
		
		
		
		
	}
	
	
	
	
	
}
