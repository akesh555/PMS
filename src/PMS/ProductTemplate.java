package PMS;


interface ProductTemplate
{
  //void createProduct();
  
	int calculateProductPrize(int p1price,int p2price);
	
	default void printProductTag()
	{
		System.out.println("We will service for all products");
		
	}
	
	static void proTemp()
	{
		System.out.println("Static all products");
	}

}

