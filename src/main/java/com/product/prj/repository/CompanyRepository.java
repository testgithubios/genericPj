package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> , JpaSpecificationExecutor<Company>{
	
	Company findByIsDefault(boolean isDefault);
}
