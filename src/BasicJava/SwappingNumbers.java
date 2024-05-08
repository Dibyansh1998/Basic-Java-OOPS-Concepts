package BasicJava;

public class SwappingNumbers {

	public static void main(String[] args)
	{
		
	
		int x=10, y=20;
		
		System.out.println("Before Swapping: x values is: "+x+ " and y value is:"+y);
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping: x values is: "+x+ " and y value is:"+y);
	}
	
}
