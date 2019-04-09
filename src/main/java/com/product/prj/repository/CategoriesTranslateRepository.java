package com.product.prj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CategoriesTranslate;

@Repository
public interface CategoriesTranslateRepository extends CrudRepository<CategoriesTranslate, Long>{

}
