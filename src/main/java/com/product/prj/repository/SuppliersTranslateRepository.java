package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliersTranslateRepository extends JpaRepository<SuppliersTranslateRepository, Long> , JpaSpecificationExecutor<SuppliersTranslateRepository>{

}
