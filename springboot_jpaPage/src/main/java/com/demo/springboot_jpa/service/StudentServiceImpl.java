package com.demo.springboot_jpa.service;

import com.demo.springboot_jpa.dao.StudentRepository;
import com.demo.springboot_jpa.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Moon
 */
@Service
public class StudentServiceImpl  implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Page<Student> listStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }
}
