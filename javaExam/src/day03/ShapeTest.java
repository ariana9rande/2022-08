package day03;

public class ShapeTest
{

	public static void main(String[] args)
	{
		Point p = new Point();
		p.setX(2);
		p.setY(5);

		p.show();

		Point p2 = new Point(10, 23);
		p2.show();
		p2.show(false);
		p2.show(true);
	}

}