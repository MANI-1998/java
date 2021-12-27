package constructor;

public class Student {

	// it will look like method overloading but it is not method overloading
	// bcoz overloading the method will be in camel but here it is pascal
	// in overloading we use method but here we are using constructor see the method
	// name
	// first letter is capital ,class name and method name are same
	// in overloading we create a obj and obj. it will call the method
	// but here we'll create a object syntax alone it is enough
	// for each and every method we had to create a separate obj syntax
	// when we create a object for a class the defaullt constructor will be executed
	// automatically at the time itself.

	// non parameterised
	// it means we will not give anything in the bracket
	public Student() {
		System.out.println("default constructor");
	}

	// parameterised
	// we must asign a value in the bracket
	public Student(int a) {
		System.out.println(a);
	}

	public Student(char b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(98);
		Student s2 = new Student('q');

	}

	// the below line is not possible instead of that chain constructor concept is
	// introduced
	//WE HAVE TO CREATE OBJECT FOR EVERY METHOD
//	this.Constructor(10);

}
