package day02;

abstract public class 자동차
{
	public 자동차()
	{
		System.out.println("자동차 생성자 실행");
	}

	public void 달리다()
	{
		System.out.println("자동차가 달립니다.");
	}

	abstract public void run();
}