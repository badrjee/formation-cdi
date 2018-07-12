package fr.gtm.proxibanque.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Address;


/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class AddressDao extends Repository<Address> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Address> findAll() {
		return this.findAll(Address.class);
	}

	@Override
	public Address findOne(Integer id) {
		return this.findOne(new Address(), id);
	}

}