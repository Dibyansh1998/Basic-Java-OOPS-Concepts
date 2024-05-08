package BasicJava;

import java.util.Scanner;

public class Vowel_Counts {
	
	public void vowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch == 'a'|| ch== 'A') || (ch == 'e'|| ch== 'E') || (ch == 'i'|| ch== 'I') ||
					(ch == 'o'|| ch== 'O') || (ch == 'u'|| ch== 'U'))
				count ++;
		}
		System.out.println("Number of Vowel= "+count);
		
	}

	public static void main(String[] args) {
		
		Vowel_Counts obj= new Vowel_Counts();
		Scanner sc= new Scanner(System.in);
		System.out.println("Input :  ");
		String str= sc.next();
		
		obj.vowels(str);
	
		

	}

}
