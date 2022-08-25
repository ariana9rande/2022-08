package day04;

public class StringTest
{

	public static void main(String[] args)
	{
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		str1 = str1.concat(" carami");

		System.out.println(str1);

		System.out.println(str2.equals(str4));
	}

}