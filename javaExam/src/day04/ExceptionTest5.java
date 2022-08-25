package day04;

import java.io.FileInputStream;

public class ExceptionTest5
{
	public static void m1() throws Exception
	{
		System.out.println("예외처리가 필요해요.");
	}

	public static void inputScore()
	{
		int score = 0; // ;
	}

	public static void main(String[] args)
	{
		try
		{
			m1();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		FileInputStream fis = new FileInputStream("a.txt");
	}

}