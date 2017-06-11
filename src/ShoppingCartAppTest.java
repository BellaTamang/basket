import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartAppTest {

	
	@Test
	public void Testtotalwithgetteranseter(){
		ShoppingCart cart = new ShoppingCart();
		Product item1 = new Product("Orange", 1, 30.0);
		Product item2 = new Product("Apple", 1, 100.0);
		cart.addProduct(item1);
		cart.addProduct(item2);
		System.out.println("Testing now....");
		assertEquals("Fields didn't match for Product count", cart.getProductCount(), 2);
		assertEquals("Fields didn't match  for Product", item1.getProductName(), "Orange");
		assertEquals("Fields didn't match for Quantity of the product", item2.getQuantity(), 1);
		assertEquals(30.0, item1.getTotalPrice(),30.0);
		assertEquals(2, cart.getProductCount());
		assertEquals(130.0, cart.getTotalCartValue(),0.0);
		
		Product item3= new Product();
		item3.setProductName("Grapes");
		item3.setQuantity(1);
		item3.setTotalPrice(100.0);
		cart.addProduct(item3);
		assertEquals("Fields didn't match for Product count", cart.getProductCount(), 3);
		assertEquals("Fields didn't match  for Product", item3.getProductName(), "Grapes");
		assertEquals("Fields didn't match for Quantity of the product", item3.getQuantity(), 1);
		
		
	}

}