package fr.gtm.cdi.proxibanque.persistence;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@ApplicationScoped
public class ClientDao implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ClientDao.class);

	@PostConstruct
	public void init() {
		LOGGER.info("CLIENT DAO BUILT -------------");
	}
}
