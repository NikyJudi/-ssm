package com.nk.dao;

import com.nk.model.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentDao {
    @Select("select user_id ,user_name, money from stu_info")
    List<Student> findAll();

    void addStudent(Student student);

    void deleteStudent(Student student);
}
