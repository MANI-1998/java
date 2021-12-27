package constructor;

public class Boat {
	
	
	public Boat() {
		System.out.println("no.1 speaker brand");
	}
	
	public Boat(int a) {
		System.out.println(a);
	}
	
	public Boat(char b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		//Boat bt = new Boat();
		Boat bt1 = new Boat(12);
		Boat bt2 = new Boat('w');
	}
}
