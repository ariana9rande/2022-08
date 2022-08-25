package day02;

public class VarTest
{
	public static void main(String[] args)
	{
		System.out.println(Variables.cv);
//		System.out.println(Variables.iv);
		Variables v = new Variables();
		System.out.println(v.iv);

		System.out.println();
		v.cv = 100;
		v.iv = 10;
		Variables v2 = new Variables();
		Variables v3 = new Variables();
		Variables v4 = new Variables();

		v2.cv = 200;
		v2.iv = 20;
		v3.cv = 300;
		v3.iv = 20;
		v4.cv = 400;
		v4.iv = 40;

		System.out.println(v2.iv);
		System.out.println(Variables.cv);
		System.out.println(v4.iv);
		System.out.println(Variables.cv);
	}
}