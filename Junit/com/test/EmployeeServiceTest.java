package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeServiceTest {
	 EmployeeService employeeService = new EmployeeService();
	 Employee e1 = new Employee(1,"Yash","yashdoke7066@gmail.com","8999415371","Pune",55000);
	 Employee e2 = new Employee(2,"Virat","virat@gmail.com","8548438291","Delhi",34000);
	 Employee e3 = new Employee(3,"Rohit","rohit@gmail.com","7869594032","Mumbai",89000);
	 Employee []  earry = {e1,e2,e3}; 
	 
	 @Test
	 public void  computeEmployeeData() {

//		 computing Per Annum Salary
		 Assert.assertEquals(Math.round(660000),Math.round(employeeService.computePerAnnumSalary(e1).getPerAnnumSalary()));
		 Assert.assertEquals(Math.round(408000),Math.round(employeeService.computePerAnnumSalary(e2).getPerAnnumSalary()));
		 Assert.assertEquals(Math.round(1068000),Math.round(employeeService.computePerAnnumSalary(e3).getPerAnnumSalary()));
		 
//		 Compute Increment
		 Assert.assertEquals(Math.round(56650),Math.round(employeeService.computeIncrement(e1).getSalaryPerMonth()));
		 Assert.assertEquals(Math.round(34000),Math.round(employeeService.computeIncrement(e2).getSalaryPerMonth()));
		 Assert.assertEquals(Math.round(93450),Math.round(employeeService.computeIncrement(e3).getSalaryPerMonth()));
		 
//		 total Salry
		 Assert.assertEquals(Math.round(184100), Math.round(employeeService.computeTotalSalary(earry)));
	 }
}
