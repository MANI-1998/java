package method_overloading;
//in the same class methods will be same but parameters will be different 
//OVERLOADING
public class Loading_1{
	public void details(String b,int a) {
		System.out.println("company name:"+b+a);
		}
	public void details(char c1,char c2,char c3) {
		System.out.println("employee initial "+c1);
		System.out.println("employee gender "+c2);
		System.out.println("employee group "+c3);
	}
	public void details(int a,int b) {
		System.out.println(a+b);
	}
	public void details(String c,char d) {
		System.out.println(c+d);
	}
	public void details(char a,int e) {
		System.out.println(a+e);
	}
	public void details(char t) {
		System.out.println(t);
	}
	public void details(int a,int b,double c) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		Loading_1 emp = new Loading_1();
		emp.details("GREENS",987);
		emp.details('r', 'm', 'b');
		emp.details(87, 99908);
		emp.details('Q');
		emp.details("james_bond",'a');
		emp.details('u',67);
		emp.details(10,20,0.5);
			
	}
	

}
