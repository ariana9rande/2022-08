package day04;

public interface AInter
{
	String name = "kang";

	public void aMethod();

	public void testMethod();

	default public void dd()
	{
		System.out.println("기본적인 구현!!");
	}
}