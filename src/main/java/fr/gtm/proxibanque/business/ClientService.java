package fr.gtm.proxibanque.business;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanque.persistence.ClientDao;

@Named
@ApplicationScoped
public class ClientService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private transient ClientDao clientDao;

	public String test() {
		return this.clientDao.getTest();
	}
}
