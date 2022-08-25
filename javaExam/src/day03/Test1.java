package day03;

public class Test1
{

	public static void main(String[] args)
	{

		// 상속 - 필드나 메서드가 각각 하나씩 있을때는 고민할 필요가 없다.
		// 필드는 오버라이드 되면 타입을 따른다.
		// 메소드는 오버라이드 되면 무조건 자식것을 사용한다.

		Parent p = new Parent();
		System.out.println(p.i); // 10
		System.out.println(p.getI()); // 10
		if (p instanceof Child)
			((Child) p).print();

		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.getI());
		c.print();

		Parent pc = new Child();
		System.out.println(pc.i);
		System.out.println(pc.getI());
		if (pc instanceof Child)
			((Child) pc).print();

	}

}