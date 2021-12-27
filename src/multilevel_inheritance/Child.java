package multilevel_inheritance;

public class Child extends Parent{
	
	public void watch() {
		System.out.println("rolex");

	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.pen();
		c.vallet();
		c.watch();
	}
}
