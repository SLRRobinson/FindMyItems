package modell;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.jboss.weld.context.http.Http;
import org.jboss.weld.context.bound.Bound;
import javax.enterprise.inject.New;
import org.jboss.weld.context.ejb.Ejb;
import org.jboss.weld.context.unbound.Unbound;
import javax.inject.Named;


@Http
@Bound
@New
@Ejb
@Unbound
@Named
@Entity
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	private String productName;
	private String productDescription;
	private Date purchseDate;
	
	@ManyToOne
	@JoinColumn(name="owner_proId")
	private Owner productsOwner;

	public Product() {

	}

	public Product(Long productId, String productName, String productDescription, Date purchseDate) {

		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.purchseDate = purchseDate;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Date getPurchseDate() {
		return purchseDate;
	}

	public void setPurchseDate(Date purchseDate) {
		this.purchseDate = purchseDate;
	}
	
	

	
}
