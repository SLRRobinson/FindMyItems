package presentation;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import modell.Owner;
import modell.Product;

@Named("productBean")
@SessionScoped
public class ProductBean implements Serializable {

	/****/
	 
	private static final long serialVersionUID = 1L;
	
	private Product product;

	public ProductBean() {
	}

	public ProductBean(Owner productOwner) {

		this.productOwner = productOwner;
	}

	@Inject
	private Owner productOwner;

	public Owner getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(Owner productOwner) {
		this.productOwner = productOwner;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
