package Inheritence;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass{
	
	
	
	@Test
	public void runtest()
	{
		Functions f= new Functions(3);//Parameterized Constructor
		int a =3;
		dothis();
		System.out.println(f.increment());
		System.out.println(f.decrement());
		System.out.println(f.multiplethree());
		System.out.println(f.multipletwo());
		
//		Multiplicationfunction m= new Multiplicationfunction(3);
//		System.out.println(m.multipletwo());
//		System.out.println(m.multiplethree());
	}
	

}
