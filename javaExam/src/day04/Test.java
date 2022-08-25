package day04;

public class Test
{
	public static void main(String[] args)
	{

		새 b = null;
		if (args[0].equals("참새"))
		{
			b = new 참새();
		} else if (args[0].equals("뻐꾸기"))
		{

			b = new 뻐꾸기();
		} else
		{
			b = new 앵무새();
		}

		b.노래하다();
	}
}