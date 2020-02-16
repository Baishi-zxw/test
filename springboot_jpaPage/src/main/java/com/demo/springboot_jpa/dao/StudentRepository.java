package com.demo.springboot_jpa.dao;

import com.demo.springboot_jpa.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}