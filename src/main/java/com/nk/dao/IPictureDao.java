package com.nk.dao;

import com.nk.model.Picture;
import com.nk.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPictureDao {

    @Select("select * from picture")
    List<Picture> findAll();

    @Select("select stu_id from picture where id =#{id}")
    String findStuIdById(Long id);

    @Select("select * from picture where stu_id=#{id}")
    List<Picture> findAllByStuId(String id);

    @Select("select * from picture where id=#{id}")
    Picture findAllById(Long id);

    @Delete("delete from picture where id=#{id}")
    void deletePictureById(Long id);
}
