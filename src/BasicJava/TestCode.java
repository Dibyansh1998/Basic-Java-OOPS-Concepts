package BasicJava;

public class TestCode {

	public static void main(String[] args) {
		
		String name="Ishu";
		String rvsname="";
		char ch;
		
		for (int i=0;i<name.length();i++)
		{
			ch=name.charAt(i);
			rvsname=ch+rvsname;
			
		}
		System.out.println(rvsname);
		
		
		
}
}
