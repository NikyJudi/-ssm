package com.nk.service.impl;

import com.nk.dao.ILoginDao;
import com.nk.model.User;
import com.nk.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService implements ILoginService {

    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public User login(User user) {
        System.out.println("登录");
        return iLoginDao.login(user);
    }
}
