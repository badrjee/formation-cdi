package fr.gtm.proxibanque.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Address;

@Named
@ApplicationScoped
public class AddressService extends CrudService<Address> {

	private static final long serialVersionUID = 1L;

}