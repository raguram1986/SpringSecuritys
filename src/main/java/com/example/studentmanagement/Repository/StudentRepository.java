package com.example.studentmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}


