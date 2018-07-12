package fr.gtm.proxibanque.business;

import java.io.Serializable;

import javax.inject.Inject;

import fr.gtm.proxibanque.domain.HbEntity;
import fr.gtm.proxibanque.persistence.Repository;

//@Named
//@ApplicationScoped
public class CrudService<ENTITY extends HbEntity> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private transient Repository<ENTITY> repository;

	public ENTITY create(ENTITY entity) {
		if (entity.getId() != null) {
			throw new IllegalArgumentException(
					"Cannot create an entity that already have an identifier.");
		}
		return this.repository.save(entity);
	}

	public ENTITY read(Integer id) {
		return this.repository.findOne(id);
	}

	public ENTITY update(ENTITY entity) {
		if (entity.getId() == null) {
			throw new IllegalArgumentException(
					"Cannot update an entity that doesn't have an identifier.");
		}
		return this.repository.save(entity);
	}

	public void delete(Integer id) {
		this.repository.deleteById(id);
	}
}