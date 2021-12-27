package array;

public class Array_Concept_1{
	public static void main(String[] args) {
		
	
	int a[]=new int[2];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[2]=50;//it has been overrided
	// to find length of the program
	System.out.println(a.length);
	//we can also give a.length instead of 4 to run the program(see the below line) 
	for (int i = 0; i < 4; i++) {
		//for loop is index based
		System.out.println(a[i]);
	}
	}
}
//array index out of bond exceptions
//it will arise when the index is given higher than the length
//above length is given as 4 if we give index upto 4 it will arise