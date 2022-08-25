package day03;

public class Bus extends Car
{

	public Bus()
	{
		super("test");
		System.out.println("bus default 생성자");
	}

	public Bus(String name)
	{
		super(name);
		System.out.println("bus 의 인자를 받는 생성자");
	}

}