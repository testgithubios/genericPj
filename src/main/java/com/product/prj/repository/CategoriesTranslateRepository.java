package com.product.prj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CategoriesTranslate;

@Repository
public interface CategoriesTranslateRepository extends JpaRepository<CategoriesTranslate, Long> , JpaSpecificationExecutor<CategoriesTranslate>{

	@Query("Select catT from CategoriesTranslate as catT where catT.categoriesId = :categoryId")
	public List<CategoriesTranslate> getListCategoriesTranslateByCategoriesId(@Param("categoryId") Long categoryId);
	
	@Modifying
	@Query("Delete from CategoriesTranslate as catT where catT.categoriesId = :categoryId")
	public void deleteCategoriesTranslateByCategoriesId(@Param("categoryId") Long categoryId);
}
