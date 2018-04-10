package business;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FinderManager {
	static EntityManager em;
	static EntityManagerFactory emf;
	static FinderManager instance;
	EntityTransaction entityTransaction = null;
	// List<Customer> customerstList = new ArrayList<Customer>();

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

}
