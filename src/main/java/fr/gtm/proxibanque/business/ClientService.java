
package fr.gtm.proxibanque.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Client;

@Named
@ApplicationScoped
public class ClientService extends CrudService<Client> {

	private static final long serialVersionUID = 1L;

}