package com.demo.springboot_jpa.service;

import com.demo.springboot_jpa.pojo.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Moon
 */
public interface StudentService {
    /**
     * 分页获得集合
     * @param pageable
     * @return
     */
    Page<Student> listStudents(Pageable pageable);
}
