package day04;

public class CaramiException extends Exception
{
	public CaramiException()
	{
		super("score 는 0-100 사의 값만 가능!!");
	}
}