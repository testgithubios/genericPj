package com.product.prj.repository;

import org.springframework.stereotype.Repository;

import com.product.prj.entity.Suppliers;

@Repository
public interface SuppliersRepository extends CrudRepository<Suppliers,Long>{

}
