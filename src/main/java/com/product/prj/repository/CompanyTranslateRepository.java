package com.product.prj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CompanyTranslate;

@Repository
public interface CompanyTranslateRepository extends CrudRepository<CompanyTranslate, Long>{

}
