package presentation;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import modell.Owner;
import modell.Product;
@Named("ownerBean")
@SessionScoped
public class OwnerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Owner ownerModell;
	@Inject
	private ProductBean productBean;
	private ArrayList<Product> productList;

	public Owner getOwnerModell() {
		return ownerModell;
	}

	public void setOwnerModell(Owner ownerModell) {
		this.ownerModell = ownerModell;
	}

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
}
