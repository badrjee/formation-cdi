package fr.gtm.proxibanque.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.BankCard;


/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class BankCardDao extends Repository<BankCard> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<BankCard> findAll() {
		return this.findAll(BankCard.class);
	}

	@Override
	public BankCard findOne(Integer id) {
		return this.findOne(new BankCard(), id);
	}

}