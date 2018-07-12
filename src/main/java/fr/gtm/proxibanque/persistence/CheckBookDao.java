package fr.gtm.proxibanque.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.CheckBook;

/**
 * Bean CDI déclaré avec Named par le "Default" Qualifier et de scope
 * "singleton" grâce à ApplicationScoped.
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class CheckBookDao extends Repository<CheckBook> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<CheckBook> findAll() {
		return this.findAll(CheckBook.class);
	}

	@Override
	public CheckBook findOne(Integer id) {
		return this.findOne(new CheckBook(), id);
	}

}