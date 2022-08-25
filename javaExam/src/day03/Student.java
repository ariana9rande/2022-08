package day03;

import day02.Person;

//class Person {
//int age;
//public String name;
//protected int height;
//private int weight;
//public void setWeight(int weight) {
//	this.weight = weight;
//}
//}

public class Student extends Person
{
	public void set()
	{
//	age = 30;
		name = "È«±æµ¿";
		height = 175;
//	setHeight(99);
		setWeight(100);
	}

	public static void main(String[] args)
	{
		Student s = new Student();
		s.set();
	}
}