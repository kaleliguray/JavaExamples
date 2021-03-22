package com.yjs3408.model.repository;

import java.util.List;

import com.yjs3408.model.entity.GenericEntity;

public interface GenericRepository<E extends GenericEntity> {

	E save(E entity);
	
	E update(E entity);
	
	void delete(E entity);
	
	E findByID(long id);
	
	List<E> findAll();
	
}
