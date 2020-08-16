package com.paypal.bfe.test.employeeserv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	
	 @Column(name="FIRSTNAME")
	 private String first_Name;
	  
	 @Column(name="LASTNAME")
	 private Integer last_Name;
	  
	 @Column(name="DATEOFBIRTH")
	 private String date_Of_Birth;
	 
	 @Column(name="ADDRESS")
	 private String address;

}
