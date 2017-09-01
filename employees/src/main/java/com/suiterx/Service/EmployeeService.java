package com.suiterx.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suiterx.entity.EmployeeEntity;
import com.suiterx.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepository;
	
	public List<EmployeeEntity> getAll(){
		List<EmployeeEntity> emp = new ArrayList<>();
		emprepository.findAll().forEach(emp::add);
		return emp;
	}
	
	public void addEmployee(EmployeeEntity emp){
		emprepository.save(emp);
	}
	
	public void deleteEmployee(Integer id){
		emprepository.delete(id);
	}
	
	public EmployeeEntity getEmployee(Integer id){
		return emprepository.findOne(id);
	}
	
	public void updateEmployee(Integer id, EmployeeEntity emp){
		emprepository.save(emp);
	}

}
