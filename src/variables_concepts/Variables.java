package variables_concepts;

public class Variables {

	//local variable
	//entire life cycle will be inside the method
	public  void add() {
		 int a=123;
		System.out.println(a);

	}
	
	//class variable or instance variable
	//entire life cycle will be outside the method and inside the class
	//class variable and static variable are simillar
	int b=456;
	public void multi() {
		System.out.println(b);

	}
	
	//static variable will be similar to the class variable
	//static keyword should be used in method name and variable name
	//variable must be outside the method in class name and variable name
	//variable ex.int a =23;
	//we need not create obj call method for static
	//ex. obj.add();
	//STATIC IS A KEYWORD WE NOT CREATE A OBJECT IF WE USE IT.
	static int c=777;
	public static void divide() {
		System.out.println(c);
		

	}
	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.add();
		obj.multi();
		divide();
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

