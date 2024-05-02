package Inheritence;

public class Functions extends Multiplicationfunction{
	
	int a;
	public Functions(int a) {
		super(a);//Parent Class Constructor will invoke
		this.a=a;
	}


	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}

}
