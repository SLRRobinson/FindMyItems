package presentation;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import business.FinderManager;
import modell.Owner;
import modell.Product;
@SessionScoped
@Named("ownerBean")
public class OwnerBean implements Serializable {

	/****/

	private static final long serialVersionUID = 1L;
	FinderManager fManager = FinderManager.getInstance();
	private Owner ownerModell;
	private Product ownersProduct;
	private ArrayList<Product> productList;

	Owner owner = new Owner();
	Product product = new Product();
	@Inject
	ProductBean productBean;

	public Owner getOwnerModell() {
		return ownerModell;
	}

	public void setOwnerModell(Owner ownerModell) {
		this.ownerModell = ownerModell;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public Product getOwnersProduct() {
		return ownersProduct;
	}

	public void setOwnersProduct(Product ownersProduct) {
		this.ownersProduct = product;
	}

	public void saveOwnersProduct() {
		FinderManager.getInstance().saveOwnersProduct(ownerModell);
	}
}
