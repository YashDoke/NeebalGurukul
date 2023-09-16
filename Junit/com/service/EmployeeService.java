package com.service;

import com.model.Employee;

public class EmployeeService {
	public Employee computePerAnnumSalary(Employee employee) {
        double annualSalary = employee.getSalaryPerMonth() * 12;
        employee.setPerAnnumSalary(annualSalary);
        return employee;
    }
	public Employee computeIncrement(Employee employee) {
		
        String city = employee.getCity();
        double increment = 0.0;

        if (city.equals("Mumbai")) {
            increment = 0.05 * employee.getSalaryPerMonth();
        } else if (city.equals("Pune")) {
            increment = 0.03 * employee.getSalaryPerMonth();
        }

        employee.setSalaryPerMonth(employee.getSalaryPerMonth() + increment);
        return employee;
    }
	 public double computeTotalSalary(Employee[] employee) {
	        double totalSalary = 0;
	        for (Employee emp : employee) {
	            totalSalary += emp.getSalaryPerMonth();
	        }
	        return totalSalary;
	    }
}
