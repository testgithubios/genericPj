package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> , JpaSpecificationExecutor<Products> {

}
