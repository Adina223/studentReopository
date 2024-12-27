package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Student;

public interface StudentService {
	
	public void saveStudent(Student student);
	
	public Student getStudent(int id);
	
	public void deleteStudent(int id);
	
	public List<Student> getAllstudnet();
	

}
