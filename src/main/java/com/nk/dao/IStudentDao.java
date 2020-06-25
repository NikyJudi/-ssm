package com.nk.dao;

import com.nk.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentDao {

    @Select("select * from stu_info")
    List<Student> findAll();

    @Insert("insert into stu_info(id,name,grade) values(#{id},#{name},#{grade})")
    void addStudent(Student student);

    @Delete("delete from stu_info where id=#{id}")
    void deleteStudent(String id);

    @Update("update stu_info set id=#{id},name=#{name},grade=#{grade} where id=#{oldId}")
    void updateStudent(@Param("id") String id,@Param("name") String name,@Param("grade") double money, @Param("oldId") String oldId);

    @Select("select * from stu_info where id=#{id}")
    Student findStudent(String id);

    @Select("select * from stu_info where name like '%${name}%'")
    List<Student> findStudentByName(@Param("name") String name);

    @Select("select * from stu_info where grade = #{grade} ")
    List<Student> findStudentByGrade(Byte grade);
    //
    @Select("select * from stu_info where id like '%" + "${id}"+"%'")
    List<Student> findStudentById(@Param("id") String id);

    @Update("update stu_info set signature=#{signature} where id =#{id}")
    void updateSignature(String id, String signature);
}
