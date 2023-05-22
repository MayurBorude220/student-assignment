package com.student.crud.api.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.crud.api.entity.Student1;
import com.student.crud.api.studentrepository1.StudentRepo;

@RestController
public class StudentController1 {

	@Autowired
	private StudentRepo studentrepo;

	@PostMapping("/student1")
	public Student1 saveStudent(@RequestBody Student1 student) {
		Student1 student1 = studentrepo.save(student);

		return student1;
	}

	@GetMapping("/student")
	public Student1 getStudent(@RequestParam int id) {
		Optional<Student1> student1 = studentrepo.findById(id);
		if (student1 != null) {
			Student1 student2 = student1.get();
			return student2;
		} else {
			return null;
		}

	}



	@PutMapping("/student")
	public Student1 updateStudent(@RequestBody Student1 student) {
		Student1 student1 = studentrepo.save(student);

		return student1;
	}

	@DeleteMapping("/student")
	public String deleteStudent(@RequestParam int id) {
		studentrepo.deleteById(id);

		return "data is deleted";
	}
}

