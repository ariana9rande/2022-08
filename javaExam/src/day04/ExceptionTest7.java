package day04;

public class ExceptionTest7
{
	public static void inputScore(int score) throws CaramiException
	{
		if (score < 0 || score > 100)
		{
			throw new CaramiException();
		}
		System.out.println("점수는 " + score);
	}

	public static void main(String[] args)
	{
		try
		{
			inputScore(110);
		} catch (CaramiException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}