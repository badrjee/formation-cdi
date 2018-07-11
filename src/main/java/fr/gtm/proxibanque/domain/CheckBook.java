package fr.gtm.proxibanque.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entité représentant un chéquier en base de données avec date d'envoi au
 * client et date de reception.
 * 
 * @author Adminl
 *
 */
@Entity
public class CheckBook implements HbEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate receivedOn;
	private LocalDate sendOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getReceivedOn() {
		return receivedOn;
	}

	public void setReceivedOn(LocalDate receivedOn) {
		this.receivedOn = receivedOn;
	}

	public LocalDate getSendOn() {
		return sendOn;
	}

	public void setSendOn(LocalDate sendOn) {
		this.sendOn = sendOn;
	}

}
