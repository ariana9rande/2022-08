package day04;

public class MyObjTest
{

	public static void main(String[] args)
	{
		MyObject myobj = new MyObject();

		System.out.println(myobj);
		System.out.println(myobj.toString());

		String str = "kang";
		System.out.println(str);
		System.out.println(str.toString());

		Person p = new Person();
		p.setName("강경미");
		p.setAge(20);

		System.out.println(p);

	}

}