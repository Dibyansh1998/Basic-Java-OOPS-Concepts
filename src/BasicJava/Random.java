package BasicJava;

import java.util.Scanner;

public class Random {
	
	
	public void reverseString(String name)
	{
		
		String reverseString=" ";
		char Ch;
		
		for (int i=0;i<name.length();i++)
		{
			Ch = name.charAt(i);
			reverseString=Ch+reverseString;
		}
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		
		Random ran= new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input :  ");
		String name = sc.next();
		ran.reverseString(name);
		
	}

}
