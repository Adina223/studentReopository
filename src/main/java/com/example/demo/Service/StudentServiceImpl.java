package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentrepository;

	@Override
	public void saveStudent(Student student) {

		studentrepository.save(student);

	}

	@Override
	public Student getStudent(int id) {

		return studentrepository.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {

		studentrepository.deleteById(id);

	}

	@Override
	public List<Student> getAllstudnet() {
		return studentrepository.findAll();

	}

}
