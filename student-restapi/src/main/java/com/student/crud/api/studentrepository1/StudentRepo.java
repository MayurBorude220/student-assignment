package com.student.crud.api.studentrepository1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crud.api.entity.Student1;

public interface StudentRepo extends JpaRepository<Student1, Integer> {

	
}
