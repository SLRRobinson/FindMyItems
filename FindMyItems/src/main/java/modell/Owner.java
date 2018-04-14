package modell;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ownerId;
	private String name;
	private String vorname;
	private Product product;
	@OneToMany(mappedBy="productsOwner")
	private ArrayList<Product> products;
	

	public Owner() {
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Owner(Long ownerId, String name, String vorname) {
		this.ownerId = ownerId;
		this.name = name;
		this.vorname = vorname;
	}
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", name=" + name + ", vorname=" + vorname + ", product=" + product
				+ ", products=" + product.getProductDescription() + "]";
	}
	
	
	
	

}
