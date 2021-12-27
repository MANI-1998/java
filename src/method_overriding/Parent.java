package method_overriding;

//Class names are DIFFERNT but methods and parameters will be SAME
//OVERRIDING
public class Parent {

	public void property() {
		System.out.println("burger");
	}

	public void property(int a) {
		System.out.println(a);
	}
	public void property(String b) {
		System.out.println(b);
	}
	public void toy() {
		System.out.println();

	}
	public static void main(String[] args) {
		Parent p = new Parent();
	//	p.property("boring");
		p.property(123);
	}

}
