package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
	
	 @Autowired
	 private EmployeeService employeeService;
	 
	 public void setEmployeeService(EmployeeService employeeService) {
		  this.employeeService = employeeService;
		 }
	 
	 
    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {
    	//syso
        Employee employee = new Employee();
        employee.setId(Integer.valueOf(id));
        employee.setFirstName("BFS");
        employee.setLastName("Developer");

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

	@Override
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		 
		  employeeService.saveEmployee(employee);
		return null;
	}
}
