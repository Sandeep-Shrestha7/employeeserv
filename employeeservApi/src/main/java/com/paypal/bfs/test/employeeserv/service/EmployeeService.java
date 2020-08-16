package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.api.model.Employee;


public interface EmployeeService {
	
	 public Employee getEmployee(Long employeeId);
	  
	 public void saveEmployee(Employee employee);

}
