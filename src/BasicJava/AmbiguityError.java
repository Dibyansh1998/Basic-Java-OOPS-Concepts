package BasicJava;

public class AmbiguityError {
	
	 public void print(int a, long b) {
	        System.out.println("int, long");
	    }

	    public void print(long a, int b) {
	        System.out.println("long, int");
	    }
	
	

	public static void main(String[] args) {
		AmbiguityError ar= new AmbiguityError();
		ar.print(10, 10);//that will give you Ambiguity error

	}

}
