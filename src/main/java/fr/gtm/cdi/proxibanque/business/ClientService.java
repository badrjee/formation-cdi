package fr.gtm.cdi.proxibanque.business;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.gtm.cdi.proxibanque.persistence.ClientDao;

@Named
@SessionScoped
public class ClientService implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ClientService.class);

	@Inject
	private ClientDao clientDao;

	public ClientService() {

	}

	@PostConstruct
	public void init() {
		LOGGER.info("CLIENT SERVICE BUILT -------------");
	}
}
