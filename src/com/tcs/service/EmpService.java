package com.tcs.service;

import java.util.ArrayList;
import java.util.List;

import com.tcs.bean.Employee;

public class EmpService {
	
	public List<Employee> getEmpDetails() {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(101125,"ABC Ahgjh","Kolkata", 2.5));
		empList.add(new Employee(102125,"sdd Ahgjh","Kolkata", 4));
		empList.add(new Employee(103125,"kkl Ahgjh","Kolkata", 1));
		empList.add(new Employee(104125,"fgt Ahgjh","Kolkata", 6));
		empList.add(new Employee(105125,"try Ahgjh","Kolkata", 5));
		
		empList.add(new Employee(106125,"ABC Ahgjh","Chennai", 2.5));
		empList.add(new Employee(107125,"sdd Ahgjh","Chennai", 4));
		empList.add(new Employee(108125,"kkl Ahgjh","Chennai", 1));
		empList.add(new Employee(109125,"fgt Ahgjh","Chennai", 6));
		empList.add(new Employee(110125,"try Ahgjh","Chennai", 5));
		
		empList.add(new Employee(111125,"ABC Ahgjh","Mumbai", 2.5));
		empList.add(new Employee(112125,"sdd Ahgjh","Mumbai", 4));
		empList.add(new Employee(113125,"kkl Ahgjh","Mumbai", 1));
		empList.add(new Employee(114125,"fgt Ahgjh","Mumbai", 6));
		empList.add(new Employee(115125,"try Ahgjh","Mumbai", 5));
		
		empList.add(new Employee(116125,"ABC Ahgjh","Bangalore", 2.5));
		empList.add(new Employee(117125,"sdd Ahgjh","Bangalore", 4));
		empList.add(new Employee(118125,"kkl Ahgjh","Bangalore", 1));
		empList.add(new Employee(119125,"fgt Ahgjh","Bangalore", 6));
		empList.add(new Employee(120125,"try Ahgjh","Bangalore", 5));
		
		
		return empList;
	}
	
	public List<Employee> getSearchDetails(String city) {
		List<Employee> resList = new ArrayList<>();
		List<Employee> empl = getEmpDetails();
		for(Employee e : empl) {
			if(e.getHomeTown().equalsIgnoreCase(city)) {
				resList.add(e);
			}
		}
		return resList;
		
	}
}
