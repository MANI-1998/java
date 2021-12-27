package constructor;
//constructor
public class Teacher {
	
	public Teacher() {
		System.out.println("PRINCIPAL");
	}
	
	public Teacher(int a) {
		System.out.println(a);
	}
	
	public Teacher(char b) {
		System.out.println(b);
	}
	
	public Teacher(long q) {
		System.out.println(123456789l);
	}
	public Teacher(float w) {
		System.out.println(w);
	}
	
	public static void main(String[] args) {
		Teacher s = new Teacher();
		Teacher s1 = new Teacher(999);
		Teacher s2 = new Teacher('t');
		Teacher s3 = new Teacher(123456789l);
		Teacher s4 = new Teacher(2345.12345f);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
