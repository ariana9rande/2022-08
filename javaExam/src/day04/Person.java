package day04;

public class Person
{
	private String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "이름 : "+ name+ "\n 나이 : "+ age;
//	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}

}