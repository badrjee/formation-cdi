package fr.gtm.proxibanque.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Account;

/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class AccountDao extends Repository<Account> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Account> findAll() {
		return this.findAll(Account.class);
	}

	@Override
	public Account findOne(Integer id) {
		return this.findOne(new Account(), id);
	}

}