package BasicJava;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Dibyansh Verma";
		String reversename = " ";
		char ch;

		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			reversename = ch + reversename;

		}
		System.out.println(reversename);

	}

}
