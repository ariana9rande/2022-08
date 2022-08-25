package day03;

public class StaticTest
{
	int i = 20;

	public void test()
	{
		System.out.println("test");
	}

	public static void test2()
	{
		System.out.println("static test");
	}

	public static void main(String[] args)
	{
		StaticTest s = new StaticTest();
		System.out.println(s.i);
		s.test();
		test2();
	}

}