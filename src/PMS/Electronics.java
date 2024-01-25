package PMS;

public class Electronics implements ProductTemplate{

	@Override
	public int calculateProductPrize(int p1price, int p2price) {
		// TODO Auto-generated method stub
		System.out.println("Electronics value");
		return p1price-p2price;
	}

	public void printProductTag()
	
	{
		System.out.println("Electronics value |||||||||");
	}
}
