package fr.gtm.proxibanque.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.gtm.proxibanque.domain.HbEntity;

public abstract class Repository<ENTITY extends HbEntity> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(Repository.class);

	private Session session;

	public Repository() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public ENTITY save(ENTITY entity) {
		this.executeInTransaction(() -> this.session.saveOrUpdate(entity));
		// this.executeInTransaction(new Runnable() {
		// @Override
		// public void run() {
		// session.saveOrUpdate(entity);
		// }
		// });
		return entity;
	}

	public ENTITY delete(ENTITY entity) {
		this.deleteById(entity.getId());
		return entity;
	}

	public void deleteById(Integer id) {
		this.executeInTransaction(() -> this.session.delete(this.findOne(id)));
	}

	protected List<ENTITY> findAll(Class<ENTITY> clazz) {
		final List<ENTITY> entities = new ArrayList<>();
		final TypedQuery<ENTITY> query = this.session.createQuery(
				"SELECT e FROM " + clazz.getSimpleName() + " e", clazz);
		entities.addAll(query.getResultList());
		return entities;
	}

	public abstract List<ENTITY> findAll();

	public abstract ENTITY findOne(Integer id);

	@SuppressWarnings("unchecked")
	protected ENTITY findOne(ENTITY entity, Integer id) {
		return (ENTITY) this.session.find(entity.getClass(), id);
	}

	private void executeInTransaction(Runnable task) {
		this.session.beginTransaction();
		try {
			task.run();
			this.session.getTransaction().commit();
		} catch (HibernateException e) {
			LOGGER.error("Impossible de créer ou mettre à jour cette entité : ",
					e);
			this.session.getTransaction().rollback();
		}
	}
}