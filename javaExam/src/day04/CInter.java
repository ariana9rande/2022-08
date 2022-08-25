package day04;

public interface CInter extends AInter, BInter
{
	public void cMethod();

	@Override
	default void dd()
	{
		// TODO Auto-generated method stub
		AInter.super.dd();
	}
}