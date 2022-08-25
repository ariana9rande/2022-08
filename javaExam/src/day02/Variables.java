package day02;

public class Variables
{
	int iv;
	static int cv;

	void method()
	{
		int lv = 0;
	}

	public static void main(String[] args)
	{
		System.out.println(cv);
//		System.out.println(iv);
//		
		Variables v = new Variables();
		System.out.println(v.iv);
	}

}