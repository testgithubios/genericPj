package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CusLanguages;

@Repository
public interface LanguagesRepository  extends JpaRepository<CusLanguages, Long> , JpaSpecificationExecutor<CusLanguages>{
	public CusLanguages findByShortName(String shortName);
	
	public CusLanguages findByName(String name);
}
