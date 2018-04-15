package business;

import modell.Owner;
import modell.Product;

public class ProductManager {

	public static void main(String[] args) {
		
		Product products = new Product();
		Owner proOwner = new Owner();
		proOwner.setProduct(products);
		proOwner.setName("David");
		proOwner.setOwnerId((long) 12);
		proOwner.setVorname("Robinson");
		products.setProductDescription("White usb");
		products.setProductId((long) 12);
		products.setProductName("Cables");
		products.setPurchseDate(null);

		System.out.println(proOwner.toString());

	}

}
