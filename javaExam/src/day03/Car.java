package day03;

public class Car
{

	public Car(String name)
	{
		this.name = name;
		System.out.println("Car ÀÎÀÚ¸¦ °®´Â »ý¼ºÀÚ!");
	}

	private String name;
	private int speed;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

}