package constructor;

public class Constructor {

	public Constructor() {
		System.out.println("Default constructor");
	}

	public Constructor(int a) {
		System.out.println("parameterised constructor :" +a);
	}

	public Constructor(String b) {
		System.out.println("parameterised constructor :" +b);
	}

	public Constructor(char c) {
		System.out.println("parameterised constructor :" +c);
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor();	
		Constructor c1 = new Constructor(999);
		Constructor c2 = new Constructor("mani");
		Constructor c3 = new Constructor('Q');
		

	}
}
