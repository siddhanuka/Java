package com.suiterx.repository;

import org.springframework.data.repository.CrudRepository;

import com.suiterx.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
