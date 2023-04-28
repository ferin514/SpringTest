package com.example.SpringBootTestDemo.repository;

import com.example.SpringBootTestDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentrepo extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);
}
