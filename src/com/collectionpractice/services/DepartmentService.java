package com.collectionpractice.services;

import java.util.ArrayList;
import java.util.List;

import com.collectionpractice.models.Department;

public class DepartmentService {

	static int id;
	static List<Department> departmentList = new ArrayList<>();
	Department department = new Department();

	public void addDepartment(String deptName) {
		
		department.setDeptID(id);
		department.setDeptName(deptName);
		departmentList.add(department);
		id++;
	}
	public List<Department> getDepartment() {
		
		return departmentList;
	}

}
