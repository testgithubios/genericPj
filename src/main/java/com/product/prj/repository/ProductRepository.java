package com.product.prj.repository;

import org.springframework.stereotype.Repository;

import com.product.prj.entity.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products,Long> {

}
