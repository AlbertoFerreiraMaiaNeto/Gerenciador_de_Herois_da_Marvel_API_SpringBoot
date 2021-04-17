package com.digitalinnovation.marvelheroesapi.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.digitalinnovation.marvelheroesapi.document.Heroes;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
