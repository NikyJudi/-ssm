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
        return iStudentDao.findAll();
    }

    @Override
    public void addStudent(Student student) {
        iStudentDao.addStudent(student);
    }

    @Override
    public void deleteStudent(String id) {
        iStudentDao.deleteStudent(id);
    }

    @Override
    public void update(Student student, String oldId) {
        iStudentDao.updateStudent(student.getId(), student.getName(), student.getGrade(), oldId);
    }

    public Student findStudent(String id) {
        return iStudentDao.findStudent(id);
    }

    public List<Student> findStudentByName(String name) {
        return iStudentDao.findStudentByName(name);
    }

    @Override
    public List<Student> findStudentByGrade(Byte grade) {
        return iStudentDao.findStudentByGrade(grade);
    }

    @Override
    public List<Student> findStudentById(String id) {
        return iStudentDao.findStudentById(id);
    }

    @Override
    public void updateSignature(String id, String signature) {
        iStudentDao.updateSignature(id, signature);
    }
}
