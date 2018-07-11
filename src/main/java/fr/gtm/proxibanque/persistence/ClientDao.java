package fr.gtm.proxibanque.persistence;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

import fr.gtm.proxibanque.domain.Client;

/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class ClientDao implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager entityManager;

	public ClientDao() {
		this.entityManager = HibernateUtil.getSessionFactory()
				.createEntityManager();
	}

	public void create(Client client) {
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(client);
		this.entityManager.getTransaction().commit();
	}

}
