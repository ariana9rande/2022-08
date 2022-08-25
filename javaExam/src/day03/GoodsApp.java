package day03;

public class GoodsApp
{

	public static void main(String[] args)
	{
		Goods cup = new Goods("ÄÅ");

		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);

		System.out.println("»óÇ°ÀÌ¸§ : " + camera.getName());
	}

}