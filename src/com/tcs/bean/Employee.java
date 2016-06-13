package com.tcs.bean;

public class Employee {
	private long empId;
	private String empName;
	private String homeTown;
	private double exp;
	public Employee(long empId, String empName, String homeTown, double exp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.homeTown = homeTown;
		this.exp = exp;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
}
