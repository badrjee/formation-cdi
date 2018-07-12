package fr.gtm.proxibanque.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.proxibanque.domain.CheckBook;

@Named
@ApplicationScoped
public class CheckBookService extends CrudService<CheckBook> {

	private static final long serialVersionUID = 1L;

}