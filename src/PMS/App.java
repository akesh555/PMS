package PMS;

public class App {

	public static void main(String args[]) {

//		ProductTemplate pa =new Product(); // normal object creation for interface
//		pa.createProduct();

//		ProductTemplate pad = new ProductTemplate() {  // using directly interface for the object.
//			@Override
//			public void createProduct() {
//				// TODO Auto-generated method stub
//
//				System.out.println("Product gggg");
//			}
//		};
		
//		ProductTemplate pad2=()->{  // using Lambda function calling interface.
//			
//			System.out.println("created");
//		};
//		
//		pad2.createProduct();
		
		//Lambda function if single code example.
		
		ProductTemplate producttemp=(int p1price,int p2price)->p1price+p2price;
		
		
		int total=producttemp.calculateProductPrize(20,40);
		System.out.println(total);
		
		ProductTemplate pa =new Product(); 
	  total= pa.calculateProductPrize(20, 20);
		System.out.println(total);
		
		
		Electronics ec=new Electronics();
		int total2= ec.calculateProductPrize(20, 70);
		System.out.println(total2);
		ec.printProductTag();
		
		ProductTemplate.proTemp();
		
		
		
	}
}