package day02;

public class Car
{
	private String name;
	int speed;
	// String ¾ÖÄª;

	public Car()
	{

	}

	public Car(String name, int speed)
	{

	}
	// public Car(int speed, String ¾ÖÄª) {

	// }
	public void setName(String name)
	{
		if (!name.equals("너나타"))
			this.name = name;
	}

	public String getName()
	{
		return name;
	}
}