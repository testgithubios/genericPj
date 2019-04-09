package com.product.prj.repository;

import org.springframework.stereotype.Repository;

import com.product.prj.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long>{
	
}
