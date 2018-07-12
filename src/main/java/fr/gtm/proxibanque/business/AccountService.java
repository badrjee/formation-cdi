package fr.gtm.proxibanque.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Account;

@Named
@ApplicationScoped
public class AccountService extends CrudService<Account> {

	private static final long serialVersionUID = 1L;
}
