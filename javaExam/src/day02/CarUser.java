package day02;

public class CarUser
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.setName("kang");

		Car c2 = new Car("carami", 200);
		//Car c3 = new Car(80, "test");

//		c.name = "너나타";
		c.setName("너나타");
		System.out.println(c.getName());
	}
}