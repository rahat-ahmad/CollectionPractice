package com.collectionpractice.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.collectionpractice.models.Department;
import com.collectionpractice.models.Student;
import com.collectionpractice.services.DepartmentService;
import com.collectionpractice.services.StudentService;

public class Institute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Department , List<Student>> institute = new HashMap<>();
		List<Student> studentList = new ArrayList<>();
		List<Department> depertmentList = new ArrayList<>();
		StudentService studentService1 = new StudentService();
		StudentService studentService2 = new StudentService();
		StudentService studentService3 = new StudentService();
		DepartmentService departmentService1 = new DepartmentService();
		DepartmentService departmentService2 = new DepartmentService();
//		Student student = new Student();
//		Department department = new Department();
		departmentService1.addDepartment("CS");
		departmentService2.addDepartment("EEE");
		depertmentList = departmentService2.getDepartment();
		
		studentService1.addStudent("Rahat", 3.83,"CS");
		studentService2.addStudent("Benajir", 3.76, "EEE");
		studentService3.addStudent("Jubayer", 3.95, "CS");
		studentList = studentService2.getStudentList();
		
		for(Department dept : depertmentList) {
			//System.out.println(45);
			List<Student> differentDeptStudent = new ArrayList<>();		
			for(Student stu : studentList) {
				if(dept.getDeptName().equalsIgnoreCase(stu.getDeptName())) {
					differentDeptStudent.add(stu);
				}
			}
			institute.put(dept, differentDeptStudent);
		}
		
		for(Map.Entry<Department , List<Student>> map : institute.entrySet()) {
			List<Student> value = new ArrayList<>();
			value = map.getValue();
			for(Student stu : value) {
				System.out.println(" ");
				System.out.print("Dept name is -- "+map.getKey().getDeptName());
				System.out.println(" Student name -- "+stu.getName());
				System.out.println(" Student CGPA -- "+stu.getCgpa());
			}
		}
		
		

	}

}
