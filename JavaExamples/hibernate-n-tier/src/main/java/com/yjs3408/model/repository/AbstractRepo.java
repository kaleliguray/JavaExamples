package com.yjs3408.model.repository;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yjs3408.model.HibernateUtil;
import com.yjs3408.model.entity.GenericEntity;

public abstract class AbstractRepo<E extends GenericEntity> implements GenericRepository<E> {
	
	protected static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public E save(E entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		entity.setCreatedDateTime(new Date());
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		return entity;
	}

	@Override
	public E update(E entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		entity.setUpdatedDateTime(new Date());
		session.update(entity);
		session.getTransaction().commit();
		session.close();
		return entity;
	}

	@Override
	public void delete(E entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		entity.setDeletedDateTime(new Date());
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}
	
}
