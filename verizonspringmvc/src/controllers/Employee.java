package controllers;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empcode;
	private String empname;
	private int salary;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int d) {
		this.salary = d;
	}
}