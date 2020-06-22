package com.nk.service.impl;

import com.nk.dao.IStudentDao;
import com.nk.model.Student;
import com.nk.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService implements IStudentService {
    @Autowired
    private IStudentDao iStudentDao;

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }
}
