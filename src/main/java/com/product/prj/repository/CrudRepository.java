package com.product.prj.repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {

	<S extends T> S save(S entity);
	
	T findOne(ID primaryKey);
	
	Iterable<T> findAll();
	
	Page<T> findAll(Pageable pageable);
	
	Long count();
	
	void delete(T entity);
	
	boolean exists(ID primaryKey);

}
