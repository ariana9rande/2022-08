package day02;

public class 버스 extends 자동차
{
	public 버스()
	{
		System.out.println("버스 생성자 실행");
	}

	public void run()
	{
		System.out.println("버스의 run!!");
	}

	public void 뒷문열다()
	{
		System.out.println("버스가 뒷문을 엽니다.");
	}

	public void 안내방송하다()
	{
		System.out.println("버스가 안내방송을 합니다.");
	}
}