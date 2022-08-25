package day04;

public interface BInter
{
	String name = "kim";

	public void bMethod();

	public void testMethod();

	default public void dd()
	{
		System.out.println("기본적인 구현!!");
	}
}