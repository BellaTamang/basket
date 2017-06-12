import java.util.ArrayList;
import java.util.List;





public class ShoppingCart {

	private List<Product> productList = new ArrayList<>(); // created a arraylist of name productList 
	private double totalCartValue;

	public int getProductCount() {        // will count the number of product entered and return it as the size of arralist
		return productList.size();
	}

	public void addProduct(Product product) { // will add the product t the arraylist
		productList.add(product);
	}
	
      /*will give the total sum of the product added in the arraylist
      have used try and catch block to hanlde the excptions */
	
	public double getTotalCartValue() {  
		try {
		if (productList.size() > 0) {
			for (Product product : productList) {
				totalCartValue = totalCartValue + product.getTotalPrice();
			}
		}
		}
		catch (NullPointerException e) {
			System.out.println("Prgramm got a fault");
		}
		return totalCartValue;
	}


}






