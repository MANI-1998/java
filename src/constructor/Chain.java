package constructor;

public class Chain {
//constructor chain
	public Chain() {
		this("java");
		System.out.println("default");
	}

	public Chain(int a) {
		System.out.println(a);
	}

	public Chain(String b) {
		this('q');
		System.out.println(b);
	}

	public Chain(char c) {
		this(128);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Chain c = new Chain();

	}
}
