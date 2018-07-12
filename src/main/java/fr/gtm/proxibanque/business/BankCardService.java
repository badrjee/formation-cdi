
package fr.gtm.proxibanque.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.BankCard;

@Named
@ApplicationScoped
public class BankCardService extends CrudService<BankCard> {

	private static final long serialVersionUID = 1L;

}