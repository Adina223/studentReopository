package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("student")
	public String addStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "Student Added";

	}

	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}

	@DeleteMapping("student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		return "Deleted student with ID: " + id;
	}

	@GetMapping("student")
	public List<Student> getAllStudent() {
		return studentService.getAllstudnet();
	}

}
