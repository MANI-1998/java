package single_inheritance_1;

public class Mani extends Raja {
	
	public void study() {
		System.out.println("java");
	}
	
	public void play() {
		System.out.println("football");

	}
	
	public static void main(String[] args) {
		Mani obj = new Mani();
		obj.do_yoga();
		obj.gardening();
		obj.act();
		obj.study();
	    obj.play();
	    
	    
	    
	    
	    
	    
	    
//	 Raja a= new Raja();
//	 a.act();
//	 a.gardening();
	}

}
