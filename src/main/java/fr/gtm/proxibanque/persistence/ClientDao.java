package fr.gtm.proxibanque.persistence;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class ClientDao implements Serializable {

	private static final long serialVersionUID = 1L;

	private String test;

	public ClientDao() {
		this.test = "Affichage depuis le bean ClientDao !";
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}
