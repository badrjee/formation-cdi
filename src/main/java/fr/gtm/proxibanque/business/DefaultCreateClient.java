package fr.gtm.proxibanque.business;

import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.Client;

@Named
@ApplicationScoped
public class DefaultCreateClient {

	@Inject
	private ClientService service;

	public String test() {
		// Construction d'un objet Client à persister.
		final Client client = new Client("Jérémy");
		client.setLastname("Masson");
		client.setBirthDate(LocalDate.of(1990, 12, 19));
		client.setNumber("00004569");
		// Appel au service.
		this.service.create(client);
		if (client.getId() != null) {
			return "Test success !";
		} else {
			return "Test failed...";
		}
	}
}