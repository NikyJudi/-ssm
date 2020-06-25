package com.nk.dao;

import com.nk.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {

    @Select("select * from login where" +
            " id=#{id} and password=#{password}")
    User login(User user);

    @Insert("insert into login value(#{id},#{password})")
    void addUser(User user);

    @Update("update login set password=#{password} where id =#{id}")
    void updatePWById(String id, String password);
}
