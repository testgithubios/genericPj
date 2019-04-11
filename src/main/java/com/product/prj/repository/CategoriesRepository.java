package com.product.prj.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long>, JpaSpecificationExecutor<Categories>{

}
