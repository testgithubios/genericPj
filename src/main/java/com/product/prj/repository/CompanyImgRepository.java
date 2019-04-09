package com.product.prj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.CompanyImg;

@Repository
public interface CompanyImgRepository extends CrudRepository<CompanyImg, Long>{

}
