package com.collectionpractice.services;

import java.util.ArrayList;
import java.util.List;

import com.collectionpractice.models.Student;

public class StudentService {
	
	Student student = new Student();
	
	static int id = 1;
	
	static List<Student> studentList = new ArrayList<>();
	
	public void addStudent(String name, double cgpa, String deptName ) {
		
		student.setId(id);
		student.setName(name);
		student.setCgpa(cgpa);
		student.setDeptName(deptName);
		studentList.add(student);
		id++;
		
	}
	
	public List<Student> getStudentList(){
		return studentList;
	}

}
