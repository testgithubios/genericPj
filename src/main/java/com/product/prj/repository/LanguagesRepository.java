package com.product.prj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.prj.entity.Languages;

@Repository
public interface LanguagesRepository extends CrudRepository<Languages, Long>{

}
