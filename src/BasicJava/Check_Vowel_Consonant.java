package BasicJava;

import java.util.Scanner;

public class Check_Vowel_Consonant {

	public void count(String str) {
		int vowel = 0, consonant = 0;
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch))
				if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
					vowel++;
				else
					consonant++;
		}
		System.out.println(" Number of Vowel:  " + vowel);
		System.out.println("Number of Consonant: " + consonant);
	}

	public static void main(String[] args) {

		Check_Vowel_Consonant cvc = new Check_Vowel_Consonant();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		String str = sc.next();

		cvc.count(str);

	}

}
