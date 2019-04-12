package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CategoriesTranslate;

@Repository
public interface CategoriesTranslateRepository extends JpaRepository<CategoriesTranslate, Long> , JpaSpecificationExecutor<CategoriesTranslate>{

}
