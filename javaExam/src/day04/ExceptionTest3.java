package day04;

public class ExceptionTest3
{

	public static void main(String[] args)
	{
		System.out.println("프로그램시작!!");

		int i = 7;
		// 예외처리!!
		//
		try
		{
			// 예외가 발생 될 수 있을 것 같은 코드를 try 블럭에 넣어준다.
			System.out.println(100 / i);
			int[] iarr =
			{ 1, 2, 3, 4, 5, 6 };
			System.out.println(iarr[i]);

		} catch (ArithmeticException e)
		{
			System.out.println("예외처리 코드 실행!!");
			System.out.println(e);
			e.printStackTrace();
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("예외처리 코드 실행!!");
//		}catch (Exception e) {
//			System.out.println("예외처리 코드 실행!!");
		} finally
		{
			System.out.println("반드시 수행할 코드!!!");
		}

		System.out.println("프로그램 종료!!");
	}

}