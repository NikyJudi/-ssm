package com.nk.dao;

import com.nk.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentDao {

    @Select("select * from stu_info")
    List<Student> findAll();

    @Insert("insert into stu_info(id,name,money) values(#{id},#{name},#{money})")
    void addStudent(Student student);

    @Delete("delete from stu_info where id=#{id}")
    void deleteStudent(String id);

    @Update("update stu_info set id=#{id},name=#{name},money=#{money} where id=#{oldId}")
    void updateStudent(@Param("id") String id,@Param("name") String name,@Param("money") double money, @Param("oldId") String oldId);

    @Select("select * from stu_info where id=#{id}")
    Student findStudent(String id);
}
