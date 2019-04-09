package com.product.prj.repository;

import org.springframework.stereotype.Repository;

import com.product.prj.entity.ProductImg;

@Repository
public interface ProductImgRepository extends CrudRepository<ProductImg,Long> {

}
