package day04;

public class ExceptionTest1
{
	public static void main(String[] args)
	{
		System.out.println("프로그램 시작");
		
		int i = 6;
		
		try
		{
			System.out.println(100 / i);
			int[] arr = {1, 2, 3, 4, 5, 6};
			System.out.println(arr[i]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
		System.out.println("프로그램 종료");
	}
}