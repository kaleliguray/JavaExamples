package com.yjs3408.hr.repo;

import java.util.List;

import com.yjs3408.hr.repo.domain.GenericEntity;

public interface GenericRepo<E extends GenericEntity> {

	boolean save(E entity);
	
	void saveAll(List<E> entities);
	
	boolean update(E entity);
	
	boolean delete(long id);

	E findById(long id);
	
	List<E> findAll();

	long count();
}
