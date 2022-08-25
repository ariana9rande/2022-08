package day03;

public class Exam01
{

	public static void main(String[] args)
	{
		byte b = 20;
		int i = b; // 묵시적 형변환

		b = (byte) i; // 명시적 형변환

		// boolean flag = (boolean)b;

		Parent p = new Child();
		Child c = (Child) p; // 명시적 형변환

		Child c2 = new Child();
		Parent p2 = c2; // 묵시적형변환
		Object obj = c2;
		Object obj2 = p;

		Bus bus = new Bus();
		// 객체들끼리의 형변환은 상속관계에 있는 것들끼리 가능하다.
	}

}