package com.nk.service;

import com.nk.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void addStudent(Student student);

    void deleteStudent(String id);

    void update(Student student, String oldId);
}
