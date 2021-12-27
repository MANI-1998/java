package variables_concepts;

public class Class_Variable {
	
	int a=12345;
	//default value of int
	int b;
	int c=a;
	
	public void add() {
		System.out.println(a+" "+b);
        System.out.println(c);
	}
	
	public static void main(String[] args) {
		Class_Variable sv = new Class_Variable();
		sv.add();
	
	}
	
	
	
	
	
	
	

}
