package string_functions;

public class String_Fn {

	public static void main(String[] args) {

		String s = "welcome to tuty";

		String s1 = "welcome To tuty";

		// it will count the letter including space
		int len = s.length();
		System.out.println(len);

		System.out.println();
		// IT WILL BECOME FALSE BCOZ JAVA IS CASE SENSITIVE
		boolean equals = s.equals(s1);
		System.out.println(equals);

		// it will ignore the case(capital) and check
		boolean eq = s.equalsIgnoreCase(s1);
		System.out.println(eq);

		// it will check wheather the given below 'we' starts with above string s
		boolean sw = s.startsWith("we");
		boolean SW1 = s1.startsWith("we");
		System.out.println(SW1);
		System.out.println(sw);

		// it will check wheather the given below 'we' ends with above string s
		boolean ew = s.endsWith("ty");
		boolean ew1 = s.endsWith("ty");
		System.out.println(ew);
		System.out.println(ew1);

		// it will convert everything to capital letter
		String uc = s.toUpperCase();
		System.out.println(uc);

		// it will convert everything to small letter
		String lc = s.toLowerCase();
		System.out.println(lc);

		// below line come shows that it comes with welcome so its true
		boolean contains = s.contains("come");
		System.out.println(contains);

		// it counts the first e from the above string s
		// it is value based
		int indexOf = s.indexOf('e');
		System.out.println(indexOf);

		// it counts the last e from the above string s
		// it is value based
		int lastIndexOf = s.lastIndexOf('e');
		System.out.println(lastIndexOf);

		// it will show the exact letter in which the 12 is given in string s
		// it is index based
		char charAt = s.charAt(10);
		System.out.println(charAt);

		// it will replace the word letter number anything
		String replace = s.replace("tuty", "tvl");
		System.out.println(replace);

		// it will start the no which was given below
		// it is index based
		String substring = s.substring(11);
		System.out.println(substring);

		// it will chech wheather any thing is inside "" including space
		boolean empty = s.isEmpty();
		System.out.println(empty);

		// string of array []
		// it will split the word,space or anything which is given below in the double
		// quotes
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.print(string);
		}
		// the below syso is given to print the space between the line in the console
		System.out.println();
		
		// the trim is used to take the space given in the front and back of the
		// sentence in the the ""
		String s10 = "     java    ";
		String trim = s10.trim();
		System.out.println(trim);
		
		// it will compare and find the difference between the a1 and a2
		// it will type the ascii value
		// ascii value of a is 97 and A is 65
		// it will find the difference with the first word only
		String a1 = "a";
		String a2 = "A";
		int compareTo = a1.compareTo(a2);
		System.out.println(compareTo);
		
		//conversion of int to string without using ""
		//return type is converted into string from int 
		//the below program said the int,double,float value can be changed to string
		//by using string.value of
		int l =99430;
		String valueOf = String.valueOf(l);
		System.out.println(valueOf);	
		float i = 12.234f;
		String valueOf2 = String.valueOf(i);
		System.out.println(valueOf2);
		
		//concat means just merging of string like below
		//merging of c1 and c2
		String c1="java";
		String c2=" PYTHON";
		String concat = c1.concat(c2);
		System.out.println(concat);
		c1=c1+c2;
		System.out.println(c1);
		

	}
}
