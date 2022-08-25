package day04;

public class BookTest
{

	public static void main(String[] args)
	{
		Book b = new Book("모두의 자바");
		Book b2 = new Book("모두의 자바");

		if (b == b2)
			System.out.println("같다");
		else
			System.out.println("다르다");

		b.equals(b);

		if (b.equals(b2))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}

}