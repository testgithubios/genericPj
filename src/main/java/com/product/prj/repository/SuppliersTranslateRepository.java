package com.product.prj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.SuppliersTranslate;

@Repository
public interface SuppliersTranslateRepository  extends CrudRepository<SuppliersTranslate, Long>{

}
