package com.suiterx.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suiterx.Service.EmployeeService;
import com.suiterx.entity.EmployeeEntity;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@RequestMapping(value="/emp")
	public List<EmployeeEntity> getAll(){
		return empservice.getAll();
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	public void addEmployee(@RequestBody EmployeeEntity emp){
		empservice.addEmployee(emp);
	}
	
	@RequestMapping(value="/emp/{id}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable Integer id ){
		empservice.deleteEmployee(id);
	}
	
	@RequestMapping(value="/emp/{id}", method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable Integer id, EmployeeEntity emp ){
		empservice.updateEmployee(id, emp);
	}
}
