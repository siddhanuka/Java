package com.conversion.repository;

import org.springframework.data.repository.CrudRepository;

import com.conversion.entity.FacilityEntity;

public interface UserRepository extends CrudRepository<FacilityEntity, Integer> {

}
