package business;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modell.Product;

import modell.Owner;

public class FinderManager {
	static EntityManager em;
	static EntityManagerFactory emf;
	static FinderManager instance;
	EntityTransaction entityTransaction = null;
	// List<Customer> customerstList = new ArrayList<Customer>();
	Product product;

	public static FinderManager getInstance() {
		if (instance == null) {
			instance = new FinderManager();
		}
		return instance;
	}

	public FinderManager() {
		emf = Persistence.createEntityManagerFactory("FindMyItems");
		em = emf.createEntityManager();
	}

	public void saveOwnersProduct(Owner owner) {
		em.getTransaction().begin();
		owner.setProduct(product);
		em.persist(owner);
		em.persist(product);
		em.getTransaction().commit();
		em.close();

	}

}
