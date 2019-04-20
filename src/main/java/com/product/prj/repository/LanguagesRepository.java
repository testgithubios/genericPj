package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CusLanguages;

@Repository
public interface LanguagesRepository  extends JpaRepository<CusLanguages, Long> , JpaSpecificationExecutor<CusLanguages>{

	@Query("Select cusL from CusLanguages as cusL where lower(cusL.shortName) = lower(:shortName)")
	public CusLanguages findByShortName(@Param("shortName") String shortName);
	
	@Query("Select cusL from CusLanguages as cusL where LOWER(cusL.name) = LOWER(:name)")
	public CusLanguages findByName(@Param("name") String name);
}
