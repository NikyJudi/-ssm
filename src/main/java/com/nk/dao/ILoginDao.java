package com.nk.dao;

import com.nk.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {

    @Select("select id, password from login where" +
            " id=#{id} and password=#{password}")
    User login(User user);

}
