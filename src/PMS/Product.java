package PMS;

public class Product implements ProductTemplate{

//	@Override
//	public void createProduct() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("Product inserted");
//		
//	}

	@Override
	public int calculateProductPrize(int p1price, int p2price) {
		// TODO Auto-generated method stub
		return p1price+p2price;
	}


		
	}


